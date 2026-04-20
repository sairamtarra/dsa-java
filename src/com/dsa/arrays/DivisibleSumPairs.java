package com.dsa.arrays;

import java.util.Scanner;

public class DivisibleSumPairs {
	static int pairsCount(int n, int k, int arr[]) {
		int freq[] = new int[k];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int rem = arr[i] % k;
			int needed = (k - rem) % k;
			count += freq[needed];
			freq[rem]++;
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = pairsCount(n, k, arr);
		System.out.println(result);
		sc.close();
	}
}
