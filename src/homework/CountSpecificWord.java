package homework;

import java.util.Scanner;

public class CountSpecificWord {

	public static void main(String[] args) {
		// Problem 06:
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split("\\W+");
		int count=0;
		String word=scanner.nextLine();
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase(word)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
