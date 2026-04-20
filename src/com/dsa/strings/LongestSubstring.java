package com.dsa.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
	static int longestUnique(String s) {
		int left = 0;
		int max = 0;
		Set<Character> set = new HashSet<>();
		for (int right = 0; right < s.length(); right++) {
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			max = Math.max(max, right - left + 1);
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		sc.close();
		int n = longestUnique(s);
		System.out.println("The length of longest substring without repeating characters is:" + n);
	}

}