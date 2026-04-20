package com.dsa.bitmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameTheory {
	static String misereNim(List<Integer> list) {
		boolean ones = true;
		int xorVal = 0;
		for (int i : list) {
			if (i != 1) {
				ones = false;
			}
			xorVal = xorVal ^ i;
		}
		if (ones) {
			if (list.size() % 2 == 0) {
				return "First";
			} else {
				return "Second";
			}
		}
		if (xorVal == 0) {
			return "Second";
		} else {
			return "First";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		String result = misereNim(list);
		System.out.println(result);
		sc.close();
	}

}
