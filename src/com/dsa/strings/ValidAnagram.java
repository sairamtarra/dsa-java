package com.dsa.strings;

import java.util.Scanner;

public class ValidAnagram {
	static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int count[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for (int num : count) {
			if (num != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		System.out.println("Enter second String:");
		String t = sc.next();
		sc.close();
		if (isAnagram(s, t)) {
			System.out.println("Yes, They are anagrams!");
		} else {
			System.out.println("They are not anagrams!");
		}
	}

}