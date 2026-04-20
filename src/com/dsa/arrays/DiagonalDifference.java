package com.dsa.arrays;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int d1 = 0;
		int d2 = 0;
		for (int i = 0; i < n; i++) {
			d1 += arr[i][i];
		}
		for (int i = 0; i < n; i++) {
			d2 += arr[i][n - 1 - i];
		}
		if (d1 > d2) {
			System.out.println(d1 - d2);
		} else {
			System.out.println(d2 - d1);
		}
	}
}