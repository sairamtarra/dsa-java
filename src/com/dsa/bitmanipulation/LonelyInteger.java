package com.dsa.bitmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyInteger {
	static int lonelyInteger(List<Integer> list) {
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			result ^= list.get(i);
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
		int result = lonelyInteger(list);
		System.out.println(result);
		sc.close();
	}

}
