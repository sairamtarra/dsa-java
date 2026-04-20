package com.dsa.arrays;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long sum = 0;
		long arr[] = new long[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
			sum += arr[i];
		}
		sc.close();

		System.out.println(sum);
	}
}