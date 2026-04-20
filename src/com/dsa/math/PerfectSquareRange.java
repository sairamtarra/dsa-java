package com.dsa.math;

import java.util.Scanner;

public class PerfectSquareRange {
	static int countSquares(int a, int b) {
		int start = (int) Math.ceil(Math.sqrt(a));
		int end = (int) Math.floor(Math.sqrt(b));
		if (start > end) {
			return 0;
		}
		return end - start + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = countSquares(a, b);
		System.out.println(result);
		sc.close();
	}

}
