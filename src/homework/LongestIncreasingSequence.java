package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		// Problem 04:
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] numbers=new int[input.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=Integer.parseInt(input[i]);
		}
		
		if (numbers.length==1) {
			System.out.println(numbers[0]);
			System.out.println("Longest: " + numbers[0]);
		}
		
		ArrayList<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> currentSequence=new ArrayList<Integer>();
		currentSequence.add(numbers[0]);
		int maxLength=1;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i-1]) {
				currentSequence.add(numbers[i]);
				if (currentSequence.size() > maxLength) {
					maxLength = currentSequence.size();
				}
				if (i==numbers.length-1) {
					sequences.add(currentSequence);
				}
			}
			else {
				sequences.add(currentSequence);
				currentSequence=new ArrayList<Integer>();
				currentSequence.add(numbers[i]);
			}
		}
		String longest="";
		for (int i = 0; i < sequences.size(); i++) {
			if (sequences.get(i).size()==maxLength && longest.length()==0) {
				longest="Longest: ";
				for (int j = 0; j < sequences.get(i).size(); j++) {
					longest= longest + sequences.get(i).get(j) + " ";
				}
				longest=longest + "\n";
			}
			printList(sequences.get(i));
		}
		System.out.println(longest);
	}

	public static void printList(ArrayList<Integer> sequence) {
		for (Integer number : sequence) {
			System.out.print("" + number + " ");
		}
		System.out.println();
	}

}
