package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestStringSequence {

	public static void main(String[] args) {
		// Problem 03:
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split(" ");
		if (words.length==1) {
			System.out.println(words[0]);
		}
		ArrayList<ArrayList<String>> sequences = new ArrayList<ArrayList<String>>();
		ArrayList<String> currentSequence=new ArrayList<String>();
		currentSequence.add(words[0]);
		int maxLength=1;
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i-1])) {
				currentSequence.add(words[i]);
				if (currentSequence.size() > maxLength) {
					maxLength = currentSequence.size();
				}
				if (i==words.length-1) {
					sequences.add(currentSequence);
				}
			}
			else {
				sequences.add(currentSequence);
				currentSequence=new ArrayList<String>();
				currentSequence.add(words[i]);
			}
		}
		for (int i = 0; i < sequences.size(); i++) {
			if (sequences.get(i).size()==maxLength) {
				printList(sequences.get(i));
				break;
			}
		}
	}

	public static void printList(ArrayList<String> sequence) {
		for (String word : sequence) {
			System.out.print(word + " ");
		}
	}
}
