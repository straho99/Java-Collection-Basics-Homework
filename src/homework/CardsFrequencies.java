package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CardsFrequencies {

	public static void main(String[] args) {
		// Problem 12:
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String[] cards=text.split(" ");
		ArrayList<String> faces=new ArrayList();
		HashMap<String, Integer> frequencies=new HashMap();
		for (int i = 0; i < cards.length; i++) {
			String face=cards[i].substring(0, cards[i].length()-1);
			if (frequencies.containsKey(face)) {
				frequencies.put(face, frequencies.get(face)+1);
			}
			else {
				frequencies.put(face, 1);
				faces.add(face);
			}
		}
		for (String face : faces) {
			System.out.printf("%1s -> %2.2f%%\n", face, 
				((double)frequencies.get(face) / (double)cards.length)*100);
		}
	}

}
