package com.dsa.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {
	static int maximizeLuck(int k, int arr[][]) {
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for (int contest[] : arr) {
			int i = contest[0];
			int j = contest[1];
			if (j == 0) {
				sum += i;
			} else {
				list.add(i);
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			if (i < k) {
				sum += list.get(i);
			} else {
				sum -= list.get(i);
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int result = maximizeLuck(k, arr);
		System.out.println(result);
		sc.close();
	}

}
