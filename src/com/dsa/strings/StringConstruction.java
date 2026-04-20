package com.dsa.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {
	static int countChar(String s) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		return set.size();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = countChar(s);
		System.out.println(result);
		sc.close();
	}

}
