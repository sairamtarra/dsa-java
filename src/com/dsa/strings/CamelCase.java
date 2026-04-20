package com.dsa.strings;

import java.util.Scanner;

public class CamelCase {
	static int countWords(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = countWords(s);
		System.out.println(result);
		sc.close();
	}

}
