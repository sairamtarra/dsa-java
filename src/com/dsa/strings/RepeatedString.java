package com.dsa.strings;

import java.util.Scanner;

public class RepeatedString {
	static long maxRepeatedChar(String s, long n) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		long repeat = n / s.length();
		long rem = n % s.length();
		long total = count * repeat;
		for (int i = 0; i < rem; i++) {
			if (s.charAt(i) == 'a') {
				total++;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextInt();
		long result = maxRepeatedChar(s, n);
		System.out.println(result);
		sc.close();
	}

}
