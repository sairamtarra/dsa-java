package com.dsa.greedy;

import java.util.Scanner;

public class MinCostConversion {
	static long calculateCost(int b, int w, int bc, int wc, int z) {
		long bbc = Math.min(bc, wc + z);
		long bwc = Math.min(wc, wc + z);
		long total = (b * bbc) + (w * bwc);
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int w = sc.nextInt();
		int bc = sc.nextInt();
		int wc = sc.nextInt();
		int z = sc.nextInt();
		long result = calculateCost(b, w, bc, wc, z);
		System.out.println(result);

		sc.close();
	}

}
