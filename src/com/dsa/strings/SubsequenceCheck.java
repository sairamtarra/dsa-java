package com.dsa.strings;

import java.util.Scanner;

public class SubsequenceCheck {
	static String checkSubsequence(String s) {
		String s1 = "hackerrank";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s1.charAt(j)) {
				j++;
			}
			if (j == s1.length()) {
				return "YES";
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = checkSubsequence(s);
		System.out.println(result);
		sc.close();
	}

}
