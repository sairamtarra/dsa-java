package com.dsa.arrays;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int arr[] = { 4, 5, 0, 7, 0, 9, 8, 0, 1, 2 };
		int n = arr.length;
		int res[] = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				res[index++] = arr[i];
			}
		}
		while (index < n) {
			res[index++] = 0;
		}
//		System.out.print("[");
//		for (int result : res) {
//			System.out.print(result + ",");
//		}
//		System.out.print("]");
		System.out.println(Arrays.toString(res));
	}
}