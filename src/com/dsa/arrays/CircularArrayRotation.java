package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularArrayRotation {
	static List<Integer> circularArrayRotation(List<Integer> list, int k, List<Integer> queries) {
		int n = list.size();
		k = k % n;
		List<Integer> result = new ArrayList<>();
		for (int q : queries) {
			int index = (q - k + n) % n;
			result.add(list.get(index));
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int k = sc.nextInt();
		List<Integer> queries = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			queries.add(sc.nextInt());
		}
		List<Integer> result = circularArrayRotation(list, k, queries);
		System.out.println(result);

		sc.close();
	}

}
