package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMails {

	public static void main(String[] args) {
		// Problem 08:
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String email="\\w+[-_.]?\\w+@[a-zA-Z]+(-)?(\\.[a-zA-Z]+)+";
		Pattern emailPattern = Pattern.compile(email);
		Matcher emailsMatcher=emailPattern.matcher(text);
		while (emailsMatcher.find()) {
			System.out.println(emailsMatcher.group());
		}
	}

}
