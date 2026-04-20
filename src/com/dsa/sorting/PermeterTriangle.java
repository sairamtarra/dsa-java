package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PermeterTriangle {
	static List<Integer> maxPerimeterTriangle(List<Integer> list) {
		int n = list.size();
		Collections.sort(list);
		for (int i = n - 1; i >= 2; i--) {
			int a = list.get(i - 2);
			int b = list.get(i - 1);
			int c = list.get(i);
			if (a + b > c) {
				List<Integer> result = new ArrayList<>();
				result.add(a);
				result.add(b);
				result.add(c);
				return result;
			}
		}
		return Arrays.asList(-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		List<Integer> result = maxPerimeterTriangle(list);
		System.out.println(result);
		sc.close();
	}

}
