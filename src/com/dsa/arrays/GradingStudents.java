package com.dsa.arrays;

import java.util.Scanner;

public class GradingStudents {
	static void grade(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			if (arr[i] < 38) {
				System.out.println(arr[i]);
			} else {
				int remainder = arr[i] % 5;
				int nearMultiple = arr[i] + (5 - remainder);
				if (nearMultiple - arr[i] < 3) {
					System.out.println(nearMultiple);
				} else {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		grade(arr);

	}
}