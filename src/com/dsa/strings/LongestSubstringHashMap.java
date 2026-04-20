package com.dsa.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringHashMap {

	static int longestUnique(String s) {

		int left = 0;
		int max = 0;

		Map<Character, Integer> map = new HashMap<>();

		for (int right = 0; right < s.length(); right++) {

			char c = s.charAt(right);

			if (map.containsKey(c)) {
				left = Math.max(left, map.get(c) + 1);
			}
			map.put(c, right);
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