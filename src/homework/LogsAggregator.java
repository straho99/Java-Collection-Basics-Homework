package homework;

import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {

	public static void main(String[] args) {
		//Java Basics. June 1, 2014, Problem 04:
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		//I use a TreeMap that contains username as key and another TreeMap as value.
		//the nested TreeMap contains the IPs as keys and total duration for each IP as value.
		TreeMap<String, TreeMap<String, Integer>> logs= new TreeMap<String, TreeMap<String, Integer>>();
		for (int i = 0; i < n; i++) {
			String[] input=scanner.nextLine().split(" ");
			String ip=input[0];
			String name=input[1];
			Integer duration=Integer.parseInt(input[2]);
			if (logs.containsKey(name)) {
				if (logs.get(name).containsKey(ip)) {
					logs.get(name).put(ip, logs.get(name).get(ip) + duration); //update the duration for this name and for this IP
					//logs.put(name, logs.get(name)); //put back in the main dictionary
				}
				else {
					logs.get(name).put(ip, duration);
				}
			}
			else {
				TreeMap<String, Integer> newIP = new TreeMap<String, Integer>();
				newIP.put(ip, duration);
				logs.put(name, newIP);
			}
		}
		for (String name : logs.keySet()) {
			System.out.printf("%s: ", name);
			int userDuration=0;
			for (String ip : logs.get(name).keySet()) {
				userDuration = userDuration + logs.get(name).get(ip);
			}
			System.out.print(userDuration + " ");
			System.out.print(logs.get(name).keySet());
			System.out.println();
		}
	}

}
