package homework;

import java.util.Scanner;

public class SequencesEqualStrings {

	public static void main(String[] args) {
		// Problem 02:
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String[] words=input.split(" ");
		String output=words[0];
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i-1])) {
					output=output + " " + words[i];
			}
			else {
				System.out.println(output);
				output=words[i];
			}
		}
		System.out.println(output);

	}

}
