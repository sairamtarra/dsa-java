package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighlightedWordArea {
	static int findArea(List<Integer> arr, String word) {
		int maxHeight = 0;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			int currentHeight = arr.get(index);
			maxHeight = Math.max(maxHeight, currentHeight);
		}
		int area = maxHeight * word.length();
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		String s = sc.next();
		int result = findArea(list, s);
		System.out.println(result);
		sc.close();
	}

}
