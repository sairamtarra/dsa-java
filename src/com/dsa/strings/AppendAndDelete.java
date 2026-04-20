package com.dsa.strings;

import java.util.Scanner;

public class AppendAndDelete {
	static String appendAndDelete(String s, String t, int k) {
		int count = 0;
		for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
			if (s.charAt(i) == t.charAt(i)) {
				count++;
			} else {
				break;
			}
		}
		int required = s.length() - count + t.length() - count;
		if (k >= s.length() + t.length()) {
			return "Yes";
		} else if (k >= required && (k - required) % 2 == 0) {
			return "Yes";
		} else {
			return "No";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int n = sc.nextInt();
		String result = appendAndDelete(s, t, n);
		System.out.println(result);
		sc.close();
	}

}
