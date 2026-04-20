package com.dsa.arrays;

import java.util.Scanner;

public class SubarrayDivision {
	static int slidingWindow(int[] arr, int sum, int size) {
		int count = 0;
		int n = arr.length;
		int currentSum = 0;
		for (int i = 0; i < size; i++) {
			currentSum += arr[i];
		}
		if (currentSum == sum) {
			count++;
		}
		for (int i = size; i < n; i++) {
			currentSum = currentSum - arr[i - size] + arr[i];
			if (currentSum == sum) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int targetSum = sc.nextInt();
		int arraySize = sc.nextInt();
		sc.close();
		int result = slidingWindow(arr, targetSum, arraySize);
		System.out.println(result);
	}
}
