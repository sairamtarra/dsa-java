package com.dsa.math;

import java.util.Scanner;

public class SmallestDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of digits:");
		int n = sc.nextInt();
		System.out.println("Enter the sum of the digits:");
		int sum = sc.nextInt();
		sc.close();
		if (sum > 9 * n) {
			System.out.println("Not possible!!");
			return;
		}
		sum -= 1;
		int res[] = new int[n];
		for (int i = n - 1; i > 0; i--) {
			if (sum > 9) {
				res[i] = 9;
				sum -= 9;
			} else {
				res[i] = sum;
				sum = 0;
			}
		}
		res[0] = sum + 1;
		System.out.println("The number formed by the constraints is:");
		for (int x : res) {
			System.out.print(x);
		}
	}

}