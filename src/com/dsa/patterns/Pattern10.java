package com.dsa.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		for (int i = 0; i <= 2 * 6 - 1; i++) {
			int stars = i;
			if (i > 5) {
				stars = 2 * 5 - i;
			}
			for (int j = 0; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
