package homework;

import java.util.HashSet;
import java.util.Scanner;

public class StuckNumbers {

	public static void main(String[] args) {
		// Exam 01 June. Problem 01:
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		String[] numbers=scanner.nextLine().split(" ");
		
		if (n<4) {
			System.out.println("No");
			return;
		}
		
		int counter=0;
		String firstPair="";
		String secondPair="";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					for (int k = 0; k < n; k++) {
						//System.out.printf("%s - %s - %s - %s\n", numbers[i], numbers[j], numbers[j2], numbers[k]);
						if (i!=j && i!=j2 && i!=k && j!=j2 && j!=k && j2!=k) {
							firstPair=numbers[i]+numbers[j];
							secondPair=numbers[j2]+numbers[k];
							if (firstPair.equals(secondPair)) {
								System.out.printf("%1$s|%2$s==%3$s|%4$s\n", numbers[i], numbers[j], numbers[j2], numbers[k]);
								counter++;
							}
						}
					}
				}
			}
		}
		if (counter==0) {
			System.out.println("No");
		}
	}
}