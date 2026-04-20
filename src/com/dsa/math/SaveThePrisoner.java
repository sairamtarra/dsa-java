package com.dsa.math;

import java.util.Scanner;

public class SaveThePrisoner {
	static int saveThePrisoner(int n, int m, int s) {
		int chairNo = ((s + m - 2) % n) + 1;
		return chairNo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int result = saveThePrisoner(n, m, s);
		System.out.println(result);

		sc.close();
	}

}
