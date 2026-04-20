package com.dsa.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingOnClouds {
	static int totalJumps(List<Integer> arr) {
		int count = 0;
		int i = 0;
		int n = arr.size();
		while (i < n - 1) {
			if (i + 2 < n && arr.get(i + 2) == 0) {
				i += 2;
			} else {
				i += 1;
			}
			count++;
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
		int result = totalJumps(list);
		System.out.println(result);
		sc.close();
	}

}
