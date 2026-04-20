package com.dsa.dp;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many terms");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		System.out.println("Fibonacci Series:");
		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");// 0 1 1 2 3 5
			int third = first + second;
			first = second;
			second = third;
		}
		sc.close();
	}

}