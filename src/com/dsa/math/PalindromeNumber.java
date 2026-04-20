package com.dsa.math;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int original = num;
		int reverse = 0;
		while (num > 0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num /= 10;
		}
		if (original == reverse) {
			System.out.println(+original + " is a Palindrome number");
		} else {
			System.out.println(+original + " is not a palindrome number");
		}
		sc.close();
	}

}