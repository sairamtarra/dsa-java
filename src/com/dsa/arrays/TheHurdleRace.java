package com.dsa.arrays;

import java.util.Scanner;

public class TheHurdleRace {
	static int maximumHeight(int k, int arr[]) {
		int maxHeight = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxHeight) {
				maxHeight = arr[i];
			}
		}
		return Math.max(0, maxHeight - k);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = maximumHeight(k, arr);
		System.out.println(result);
		sc.close();
	}

}
