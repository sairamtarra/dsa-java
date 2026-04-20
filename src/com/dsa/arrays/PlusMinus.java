package com.dsa.arrays;

import java.util.Scanner;

public class PlusMinus {
	static void plusMinus(int[] arr) {
		int n = arr.length;
		int pos = 0, neg = 0, zero = 0;
		for (int num : arr) {
			if (num > 0) {
				pos++;
			} else if (num < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		double posRatio = (double) pos / n;
		double negRatio = (double) neg / n;
		double zeroRatio = (double) zero / n;

		System.out.println(posRatio);
		System.out.println(negRatio);
		System.out.println(zeroRatio);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		plusMinus(arr);
		sc.close();
	}
}