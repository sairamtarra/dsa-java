package com.dsa.math;

import java.util.Scanner;

public class LargestDigitSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of digits:");
		int n = sc.nextInt();
		System.out.println("Enter the resultant sum:");
		int sum = sc.nextInt();
		sc.close();

		if (sum > 9 * n) {
			System.out.println("Not possible!!");
			return;
		}

		System.out.println("Largest number formed is:");

		for (int i = 0; i < n; i++) {
			if (sum >= 9) {
				System.out.print(9);
				sum -= 9;
			} else {
				System.out.print(sum);
				sum = 0;
			}
		}
	}

}