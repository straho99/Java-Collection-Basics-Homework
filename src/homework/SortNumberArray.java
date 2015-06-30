package homework;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumberArray {

	public static void main(String[] args) {
		// Problem 01:
		Scanner scanner=new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		int[] numbers=new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=scanner.nextInt();
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
