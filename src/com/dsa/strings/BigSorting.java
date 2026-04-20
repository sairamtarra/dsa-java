package com.dsa.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigSorting {
	static List<String> bigSort(List<String> list) {
		Collections.sort(list, (a, b) -> {
			if (a.length() != b.length()) {
				return a.length() - b.length();
			}
			return a.compareTo(b);
		});
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		List<String> result = bigSort(list);
		System.out.println(result);
		sc.close();
	}

}