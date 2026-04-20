package com.dsa.strings;

import java.util.Scanner;

public class PalindromeIndex {
	static boolean isPalin(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	static int removalCount(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				if (isPalin(s, i + 1, j)) {
					return i;
				} else if (isPalin(s, i, j - 1)) {
					return j;
				}
				return -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = removalCount(s);
		System.out.println(result);
		sc.close();
	}

}
