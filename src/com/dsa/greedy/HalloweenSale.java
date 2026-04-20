package com.dsa.greedy;

import java.util.Scanner;

public class HalloweenSale {
	static int maxPurchases(int p, int d, int m, int s) {
		int count = 0;
		int total = 0;
		int price = p;
		while (total + price <= s) {
			count++;
			total += price;
			price -= d;
			if (price < m) {
				price = m;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int d = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int result = maxPurchases(p, d, m, s);
		System.out.println(result);
		sc.close();
	}

}
