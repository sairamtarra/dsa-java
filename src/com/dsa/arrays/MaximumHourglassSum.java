package com.dsa.arrays;

import java.util.Scanner;

public class MaximumHourglassSum {
	static int maxSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		int n = arr.length;
		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j <= n / 2; j++) {
				int currentSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				maxSum = Math.max(maxSum, currentSum);
			}
		}
		return maxSum;
	}

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
		int result = maxSum(arr);
		System.out.println(result);
	}

}
