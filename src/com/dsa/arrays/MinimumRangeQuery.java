package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumRangeQuery {
	static List<Integer> findMinimumRange(int n, List<Integer> width, List<List<Integer>> cases) {
		List<Integer> result = new ArrayList<>();
		for (List<Integer> c : cases) {
			int i = c.get(0);
			int j = c.get(1);
			int min = width.get(i);
			for (int k = i; k <= j; k++) {
				if (width.get(k) < min) {
					min = width.get(k);
				}
			}
			result.add(min);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> width = new ArrayList<>();
		List<List<Integer>> cases = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			width.add(sc.nextInt());
		}
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			List<Integer> query = new ArrayList<>();
			query.add(start);
			query.add(end);
			cases.add(query);
		}
		List<Integer> result = findMinimumRange(n, width, cases);
		System.out.println(result);

		sc.close();
	}

}
