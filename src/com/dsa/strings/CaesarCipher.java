package com.dsa.strings;

import java.util.Scanner;

public class CaesarCipher {
	static String stringRotate(String s, int k) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				ch[i] = (char) ('a' + (ch[i] - 'a' + k) % 26);
			} else if (Character.isUpperCase(ch[i])) {
				ch[i] = (char) ('A' + (ch[i] - 'A' + k) % 26);

			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		String result = stringRotate(s, k);
		System.out.println(result);
		sc.close();
	}
}
