package com.dsa.patterns;

public class Pattern19 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		int sp = 8;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
			sp -= 2;
		}
	}

}
