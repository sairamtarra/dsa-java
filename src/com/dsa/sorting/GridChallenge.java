package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GridChallenge {
	static String sortedGrid(List<String> grid) {
		List<String> list = new ArrayList<>();
		for (String s : grid) {
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			list.add(sorted);
		}
		int rows = list.size();
		int cols = list.get(0).length();
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows - 1; i++) {
				if (list.get(i).charAt(j) > list.get(i + 1).charAt(j)) {
					return "NO";
				}
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> grid = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			grid.add(sc.next());
		}
		String result = sortedGrid(grid);
		System.out.println(result);
		sc.close();
	}

}
