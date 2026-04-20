package com.dsa.greedy;

import java.util.Scanner;

public class ChocolateFeast {
	static int wrapperExchange(int n, int c, int m) {
		int chocolates = n / c;
		int total = chocolates;
		int wrappers = chocolates;
		while (wrappers >= m) {
			int choco = wrappers / m;
			total += choco;
			wrappers = (wrappers % m) + choco;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		int result = wrapperExchange(n, c, m);
		System.out.println(result);
		sc.close();
	}

}
