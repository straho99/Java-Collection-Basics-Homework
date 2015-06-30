package homework;

import java.util.HashSet;
import java.util.Scanner;

public class ExtractUniqueWords {

	public static void main(String[] args) {
		// Problem 10:
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		text=text.toLowerCase();
		String[] words=text.split("[\\W0-9]+");
		//System.out.println(words);
		HashSet<String> uniqueWords=new HashSet();
		for (String word : words) {
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
			}
		}
		for (String word : uniqueWords) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
	
}
