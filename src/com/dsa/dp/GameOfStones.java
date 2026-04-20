package com.dsa.dp;

import java.util.Scanner;

public class GameOfStones {
	static String winOrLose(int n) {
		if (n % 7 == 0 || n % 7 == 1) {
			return "Second";
		} else {
			return "First";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String result = winOrLose(i);
			System.out.println(result);
		}
		sc.close();
	}

}