package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineLetters {

	public static void main(String[] args) {
		// Problem 09:
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		ArrayList<Character> firstLine=new ArrayList<Character>();
		for (int i = 0; i < text.length(); i=i+2) {
			firstLine.add(text.charAt(i));
		}
		ArrayList<Character> secondLine=new ArrayList<Character>();
		text=scanner.nextLine();
		for (int i = 0; i < text.length(); i=i+2) {
			secondLine.add(text.charAt(i));
		}
		ArrayList<Character> combined=new ArrayList<Character>();
		combined.addAll(firstLine);
		for (Character charToAdd : secondLine) {
			if (!firstLine.contains(charToAdd)) {
				combined.add(charToAdd);
			}
		}
		printList(combined);
	}
	
	public static void printList(ArrayList<Character> chars){
		String output="" + chars.get(0);
		for (int i = 1; i < chars.size(); i++) {
			output=output + " " + chars.get(i);
		}
		System.out.println(output);
	}

}
