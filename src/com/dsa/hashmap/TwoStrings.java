package com.dsa.hashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {
	static String checkCharacter(String s1, String s2) {
		Set<Character> set = new HashSet<>();
		for (char ch : s1.toCharArray()) {
			set.add(ch);
		}
		for (char c : s2.toCharArray()) {
			if (set.contains(c)) {
				return "Yes";
			}
		}
		return "No";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String result = checkCharacter(s1, s2);
		System.out.println(result);
		sc.close();
	}

}
