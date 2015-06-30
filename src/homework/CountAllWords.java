package homework;

import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		// Problem 05:
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split("\\W+");
		System.out.println(words.length);
	}

}
