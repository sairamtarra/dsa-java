package com.dsa.arrays;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MaxFrequency {
	static int tallestCandle(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int maxFreq = 0;
		for (int key : map.keySet()) {
			int freq = map.get(key);
			if (freq > maxFreq) {
				maxFreq = freq;
			}
		}
		return maxFreq;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int result = tallestCandle(arr);
		System.out.println(result);
	}
}