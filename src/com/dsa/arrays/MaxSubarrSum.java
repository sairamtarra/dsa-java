package com.dsa.arrays;

import java.util.Scanner;

public class MaxSubarrSum {
	static int maxSum(int arr[], int k) {
		int windowSum = 0;
		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i];
			windowSum -= arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the subarray:");
		int k = sc.nextInt();
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int result = maxSum(arr, k);
		System.out.println("Maximum sum of the subarray is:" + result);
	}

}