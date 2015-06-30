package homework;

import java.util.Scanner;

public class CountSubstrings {

	public static void main(String[] args) {
		// Problem 07:
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int count=0;
		int position=0;
		String substring=scanner.nextLine();
		text=text.toLowerCase();
		substring=substring.toLowerCase();
		while (text.indexOf(substring, position)>=0) {
			count++;
			position=text.indexOf(substring, position) + 1;
		}
		System.out.println(count);
		
	}

}
