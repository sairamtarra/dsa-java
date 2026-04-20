package com.dsa.misc;

import java.util.Scanner;

public class SockMerchant {
	static int sockMerchant(int n, int[] arr) {
		int[] count = new int[101];
		for (int sock : arr) {
			count[sock]++;
		}
		int pairs = 0;
		for (int i = 0; i < 101; i++) {
			pairs += count[i] / 2;
		}
		return pairs;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 9;
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		sc.close();
		int result = sockMerchant(n, arr);
		System.out.println(result);
	}

}