package com.dsa.patterns;

public class Pattern12 {

	// 1      1
	// 12    21
	// 123  321
	// 12344321

	public static void main(String[] args) {
		int spaces = 2 * (4 - 1);
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
			spaces -= 2;
		}
	}

}
