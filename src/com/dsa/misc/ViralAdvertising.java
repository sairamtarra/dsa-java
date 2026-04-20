package com.dsa.misc;

import java.util.Scanner;

public class ViralAdvertising {
	static int cumulative(int n) {
		int total = 0;
		int shared = 5;
		for (int i = 0; i < n; i++) {
			int likes = shared / 2;
			total += likes;
			shared = likes * 3;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = cumulative(n);
		System.out.println(result);
		sc.close();
	}

}
