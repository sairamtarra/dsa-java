package com.dsa.strings;

import java.util.Scanner;

public class StrongPassword {
	static int minLength(int n, String password) {
		int count = 0;
		boolean hasDigit = false;
		boolean hasSpecial = false;
		boolean hasLower = false;
		boolean hasUpper = false;
		String special = "!@#$%^&*()-+";
		for (int i = 0; i < n; i++) {
			char ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				hasDigit = true;
			} else if (Character.isLowerCase(ch)) {
				hasLower = true;
			} else if (Character.isUpperCase(ch)) {
				hasUpper = true;
			} else if (special.contains(String.valueOf(ch))) {
				hasSpecial = true;
			}
		}
		if (!hasDigit)
			count++;
		if (!hasLower)
			count++;

		if (!hasUpper)
			count++;

		if (!hasSpecial)
			count++;

		int minLengthNeeded = 6 - n;
		return Math.max(count, minLengthNeeded);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String password = sc.next();
		int result = minLength(n, password);
		System.out.println(result);
		sc.close();
	}

}
