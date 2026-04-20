package com.dsa.arrays;

import java.util.Arrays;

public class MaxMinRearrange {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 6, 1, 3 };
		Arrays.sort(arr); // 1 2 3 4 5 6
		int left = 0;
		int right = arr.length - 1;
		int index = 0;
		int result[] = new int[arr.length];
		while (left <= right) {
			if (left != right) {
				result[index++] = arr[right--];
				result[index++] = arr[left++];
			} else {
				result[index++] = arr[left++];
			}
		}
		System.out.println(Arrays.toString(result));

	}

}