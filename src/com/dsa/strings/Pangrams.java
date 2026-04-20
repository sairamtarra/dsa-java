package com.dsa.strings;

import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {
	static String pangramCheck(String s) {
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if (Character.isLetter(ch)) {
				set.add(ch);
			}
		}
		if (set.size() == 26) {
			return "pangram";
		} else {
			return "not pangram";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = pangramCheck(s);
		System.out.println(result);
		sc.close();
	}

}
