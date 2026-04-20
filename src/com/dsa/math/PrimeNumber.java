package com.dsa.math;

import java.util.Scanner;

public class PrimeNumber {
	static boolean primeCheck(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if (primeCheck(n)) {
			System.out.println(+n + " is prime number");
		} else {
			System.out.println(+n + " is not prime number");
		}

		sc.close();
	}

}