package com.dsa.strings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";

		char a[] = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if (Arrays.equals(a, b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not a Anagram");
		}
	}

}