package homework;

import java.util.Scanner;

public class SumCards {

	public static void main(String[] args) {
		// Java Basics. June 1, 2014, Problem 02:
		Scanner scanner=new Scanner(System.in);
		String[] myHand=scanner.nextLine().split(" ");
		int[]cardValues=new int[myHand.length];
		for (int i = 0; i < cardValues.length; i++) {
			//System.out.printf("\"%s\" - \"%s\"\n", myHand[i], myHand[i].substring(0, myHand[i].length() - 1));
			String face=myHand[i].substring(0, myHand[i].length() - 1);
			if (face.equals("J")) {
				cardValues[i]=12;
			}
			else if(face.equals("Q")) {
				cardValues[i]=13;
			}
			else if (face.equals("K")) {
				cardValues[i]=14;
			}
			else if (face.equals("A")) {
				cardValues[i]=15;
			}
			else {
				cardValues[i]=Integer.parseInt(face);
			}
		}
		if (cardValues.length==1) {
			System.out.println(cardValues[0]);
			return;
		}
		int sum=0;
		for (int i = 0; i < cardValues.length; i++) {
			if (i==0) {
				if (cardValues[i]==cardValues[i+1]) {
					sum=sum + cardValues[i]*2;
				}
				else {
					sum=sum + cardValues[i];
				}
			}
			else if (i==cardValues.length-1) {
				if (cardValues[i]==cardValues[i-1]) {
					sum=sum + cardValues[i]*2;
				}
				else {
					sum=sum + cardValues[i];
				}
			}
			else {
				if (cardValues[i]==cardValues[i+1] || cardValues[i]==cardValues[i-1]) {
					sum=sum + cardValues[i]*2;
				}
				else {
					sum=sum + cardValues[i];
				}
			}
		}
		System.out.println(sum);
	}

}
