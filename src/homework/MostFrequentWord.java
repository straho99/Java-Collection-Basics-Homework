package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MostFrequentWord {

	public static void main(String[] args) {
		// Problem 11:
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		text=text.toLowerCase();
		String[] words=text.split("[\\W0-9]+");
		//System.out.println(words);
		HashMap<String, Integer> uniqueWords=new HashMap();
		
		for (String word : words) {
			if (uniqueWords.containsKey(word)) {
				uniqueWords.put(word, uniqueWords.get(word)+1);
			}
			else {
				uniqueWords.put(word, 1);
			}
		}
		
		int maxFrequency=1;
		for (String word : uniqueWords.keySet()) {
			if (uniqueWords.get(word)>maxFrequency) {
				maxFrequency=uniqueWords.get(word);
			}
		}
		for (String word : uniqueWords.keySet()) {
			if (uniqueWords.get(word)==maxFrequency) {
				System.out.println(word + " -> " + uniqueWords.get(word) + " times");
			}
		}
	}

}
