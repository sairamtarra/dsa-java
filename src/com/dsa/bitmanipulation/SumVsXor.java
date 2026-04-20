package com.dsa.bitmanipulation;

import java.util.Scanner;

public class SumVsXor {
	static int commonSumXor(int n) {
		int count = 0;
		while (n > 0) {
			int rem = n % 2;
			if (rem == 0) {
				count++;
			}
			n /= 2;
		}
		return (int) Math.pow(2, count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = commonSumXor(n);
		System.out.println(result);
		sc.close();
	}

}
