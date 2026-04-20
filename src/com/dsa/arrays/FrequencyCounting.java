package com.dsa.arrays;

import java.util.Scanner;

public class FrequencyCounting {
	static int maxFrequency(int[] arr) {
		int n = arr.length;
		int freq[] = new int[6];
		for (int i = 0; i < n; i++) {
			int type = arr[i];
			freq[type]++;
		}
		int maxCount = 0;
		int result = 0;
		for (int i = 1; i <= 5; i++) {
			if (freq[i] > maxCount) {
				maxCount = freq[i];
				result = i;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int result = maxFrequency(arr);
		System.out.println(result);
	}
}