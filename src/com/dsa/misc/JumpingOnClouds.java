package com.dsa.misc;

import java.util.Scanner;

public class JumpingOnClouds {
	static int energy(int arr[], int k) {
		int energy = 100;
		int start = 0;
		int n = arr.length;
		do {
			start = (start + k) % n;
			energy -= 1;
			if (arr[start] == 1) {
				energy -= 2;
			}

		} while (start != 0);
		return energy;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int result = energy(arr, k);
		System.out.println(result);
		sc.close();
	}

}
