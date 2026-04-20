package com.dsa.math;

import java.util.Scanner;

public class DrawingBook {
	static int pageCount(int n, int p) {
		int front = p / 2;
		int back = (n / 2) - (p / 2);
		int result = Math.min(front, back);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int result = pageCount(n, p);
		System.out.println(result);
		sc.close();
	}
}
