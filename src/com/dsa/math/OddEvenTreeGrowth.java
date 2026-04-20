package com.dsa.math;

import java.util.Scanner;

public class OddEvenTreeGrowth {
	static int height(int n) {
		int height = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				height = height + 1;
			} else {
				height = height * 2;
			}
		}
		return height;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = height(n);
		System.out.println(result);
		sc.close();
	}

}
