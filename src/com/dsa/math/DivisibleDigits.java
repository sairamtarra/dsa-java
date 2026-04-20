package com.dsa.math;

import java.util.Scanner;

public class DivisibleDigits {
	static int countDigits(int n) {
		int count = 0;
		int temp = n;
		while (n > 0) {
			int digit = n % 10;
			if (digit != 0 && temp % digit == 0) {
				count++;
			}
			n /= 10;

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = countDigits(n);
		System.out.println(result);
		sc.close();
	}

}
