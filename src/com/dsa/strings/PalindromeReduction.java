package com.dsa.strings;

import java.util.Scanner;

public class PalindromeReduction {
	static int palindrome(String s) {
		int count = 0;
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			int left = s.charAt(i);
			int right = s.charAt(j);
			count += Math.abs(left - right);
			i++;
			j--;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = palindrome(s);
		System.out.println(result);
		sc.close();
	}

}
