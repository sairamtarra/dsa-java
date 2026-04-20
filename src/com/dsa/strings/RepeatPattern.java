package com.dsa.strings;

import java.util.Scanner;

public class RepeatPattern {
	static int findLength(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i % 3 == 0 || i % 3 == 2) {
				if (s.charAt(i) != 'S') {
					count++;
				}
			} else {
				if (s.charAt(i) != 'O') {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = findLength(s);
		System.out.println(result);
		sc.close();
	}

}
