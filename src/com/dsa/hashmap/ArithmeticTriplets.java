package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ArithmeticTriplets {
	static int countTriplets(int d, List<Integer> list) {
		int count = 0;
		HashSet<Integer> set = new HashSet<>(list);
		for (int x : set) {
			if (set.contains(x + d) && set.contains(x + 2 * d)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int d = sc.nextInt();
		int result = countTriplets(d, list);
		System.out.println(result);
		sc.close();
	}

}
