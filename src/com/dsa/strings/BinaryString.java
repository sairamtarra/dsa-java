package com.dsa.strings;

import java.util.Scanner;

public class BinaryString {
	static int binaryValue(String s) {
		int n = s.length();
		int count = 0;
		for (int i = 0; i <= n - 3;) {
			if (s.charAt(i) == '0' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '0') {
				count++;
				i += 3;

			} else {
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = binaryValue(s);
		System.out.println(result);
		sc.close();
	}

}
