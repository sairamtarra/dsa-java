package com.dsa.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {
	static void miniMaxSum(List<Integer> arr) {
		int n = arr.size();
		long sum = 0;
		int min = arr.get(0);
		int max = arr.get(0);

		for (int i = 0; i < n; i++) {
			sum += arr.get(i);

			if (arr.get(i) < min) {
				min = arr.get(i);
			} else if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}

		long minSum = sum - max;
		long maxSum = sum - min;

		System.out.println(minSum + " " + maxSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		miniMaxSum(list);
		sc.close();
	}
}