package homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.trim();
		String regtext="-?\\d+";
		Pattern numberPattern = Pattern.compile(regtext);
		Matcher numberMatcher=numberPattern.matcher(input);
		ArrayList<Integer> numbers= new ArrayList<>();
		while (numberMatcher.find()) {
			System.out.println(numberMatcher.group());
		}
	}

}