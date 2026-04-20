package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {
	static int minDiffSubarray(List<Integer> arr) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int maxCount = 0;
		for (int key : map.keySet()) {
			int currentCount = map.get(key);
			int nextCount = map.getOrDefault(key, 0);
			maxCount = Math.max(maxCount, currentCount + nextCount);
		}
		return maxCount;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int result = minDiffSubarray(arr);
		System.out.println(result);
		sc.close();
	}

}
