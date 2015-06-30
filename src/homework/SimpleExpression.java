package homework;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleExpression {

	public static void main(String[] args) {
		// Java Basics. June 1, 2014, Problem 03:
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		input=input.trim();
		String[] strNumbers = input.split("[( )+-]+");

		ArrayList<String> strSigns=new ArrayList<>();
		Pattern signs = Pattern.compile("[+-]");
		Matcher signsMatcher=signs.matcher(input);
		while (signsMatcher.find()) {
			strSigns.add(signsMatcher.group());
		}
		
		BigDecimal result=new BigDecimal(strNumbers[0]);
		int i;
		for (i = 1; i < strNumbers.length; i++) {
			if (strSigns.get(i-1).equals("+")) {
				result = result.add(new BigDecimal(strNumbers[i]));
			}
			else {
				result = result.subtract(new BigDecimal(strNumbers[i]));
			}
		}
		System.out.printf("%.7f", result);
	}	
}
