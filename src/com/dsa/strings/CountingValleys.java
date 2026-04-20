package com.dsa.strings;

import java.util.Scanner;

public class CountingValleys {
	static int countValleys(int steps, String path) {
		int level = 0;
		int valleys = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				level += 1;
			} else {
				level -= 1;
			}
			if (path.charAt(i) == 'U' && level == 0) {
				valleys += 1;
			}
		}
		return valleys;
	}

	public static void main(String[] arsg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int result = countValleys(n, s);
		System.out.println(result);
		sc.close();
	}
}
