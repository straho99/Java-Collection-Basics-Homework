package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawler {

	public static final int DEPTH=3;
	public static final String START_URL="http://sportal.bg";
	public static HashSet<String> visitedURLs;
	
	
	public static void main(String[] args) {
		// Problem 13:
		//I use the external library jsoup. It is very simple to work with it!
		//Getting the links from an html documents is several lines of code only.
		visitedURLs=new HashSet<>();
		crawlURLs(START_URL, 1);
		printCrawled("crawled-urls.txt");
	}
	//This is the crawler. It starts from a URL, finds its child urls and for each of them recursively calls itself.
	//in the beginning, it checks to see if depth reached (currentLevel) is not higher than the MAX.
	//If it is, then it returns doing nothing more...
	public static void crawlURLs(String url, int currentLevel) {
		if (currentLevel>DEPTH) {
			return;
		}
		try {
			ArrayList<String>childLinks=getLinksFromURL(url);
			for (String link : childLinks) {
				
				if (!visitedURLs.contains(link)) {
					visitedURLs.add(link);
					System.out.printf("Level %d: %s\n", currentLevel, link);
					crawlURLs(link, currentLevel + 1);
				}
			}
		} catch (Exception e) {
			System.out.println("Unable to get URL: " + url);
		}
		
		
	}
	//utility function that gets all child urls from a url:
	public static ArrayList<String> getLinksFromURL(String url) throws IOException{
		ArrayList<String> links=new ArrayList<String>();
		Document doc;
		doc = Jsoup.connect(url).get();
		Elements linksFound = doc.select("a[href]");
		for (Element element : linksFound) {
			String linkText=element.attr("abs:href");
			if (linkText.length()==0) {
				continue;
			}
			links.add(linkText);
		}
		return links;
	}
	//utility function to write the entries in the HashSet to file:
	public static void printCrawled(String fileName){
		try(PrintStream fileOutput = new PrintStream(fileName, "UTF-8");) {
				for (String url : visitedURLs) {
					fileOutput.println(url);
				}
			} catch (IOException ioex) {
				System.out.println("Could not write the file.");
			}
	}
}

	