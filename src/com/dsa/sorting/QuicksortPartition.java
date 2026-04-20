package com.dsa.sorting;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class QuicksortPartition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int pivot = arr[0];
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		// 4 5 3 7 2
		equal.add(pivot);
		for (int i = 1; i < n; i++) {
			if (arr[i] > pivot) {
				right.add(arr[i]);
			} else if (arr[i] < pivot) {
				left.add(arr[i]);
			} else {
				equal.add(arr[i]);
			}
		}
		List<Integer> result = new ArrayList<>();
		result.addAll(left);
		result.addAll(equal);
		result.addAll(right);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}