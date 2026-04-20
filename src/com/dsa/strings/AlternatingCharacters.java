package com.dsa.strings;

import java.util.Scanner;

public class AlternatingCharacters {
	static int minCharacters(String s) {
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = minCharacters(s);
		System.out.println(result);
		sc.close();
	}

}
