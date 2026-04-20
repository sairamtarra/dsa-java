package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MinimumDeletions {
	static int minDeletions(List<Integer> arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int maxFreq = 0;
		for (int freq : map.values()) {
			maxFreq = Math.max(maxFreq, freq);
		}
		return arr.size() - maxFreq;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int result = minDeletions(list);
		System.out.println(result);
		sc.close();
	}

}
