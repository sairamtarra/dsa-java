package com.dsa.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDiff {
	static int minAbsoluteDiff(int arr[]) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			int diff = Math.abs(arr[i] - arr[i - 1]);
			min = Math.min(min, diff);
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = minAbsoluteDiff(arr);
		System.out.println(result);
		sc.close();
	}

}
