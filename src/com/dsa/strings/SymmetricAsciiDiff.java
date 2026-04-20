package com.dsa.strings;

import java.util.Scanner;

public class SymmetricAsciiDiff {
	static String checkFunny(String s) {
		int n = s.length();
		for (int i = 0; i < n - 2; i++) {
			if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != Math.abs(s.charAt(n - 1 - i) - s.charAt(n - 2 - i))) {
				return "Not Funny";
			}
		}
		return "Funny";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = checkFunny(s);
		System.out.println(result);
		sc.close();
	}

}
