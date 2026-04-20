package com.dsa.math;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int original = n;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit * digit;
			n /= 10;
		}
		if (sum == original) {
			System.out.println(+original + " is Armstrong number");
		} else {
			System.out.println(+original + " is not a Armstrong number");
		}
		sc.close();
	}

}