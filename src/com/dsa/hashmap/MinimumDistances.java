package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {
	static int minDistance(List<Integer> list) {
		int n = list.size();
		int min = Integer.MAX_VALUE;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(list.get(i))) {
				int index = map.get(list.get(i));
				int dist = i - index;
				min = Math.min(dist, min);
			}
			map.put(list.get(i), i);
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int result = minDistance(list);
		System.out.println(result);
		sc.close();
	}

}
