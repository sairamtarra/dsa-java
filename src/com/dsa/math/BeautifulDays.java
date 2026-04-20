package com.dsa.math;

import java.util.Scanner;

public class BeautifulDays {
	static int beautifulDays(int x, int y, int z) {
		int count = 0;
		for (int i = x; i <= y; i++) {
			int rev = 0;
			int temp = i;
			while (temp > 0) {
				int digit = temp % 10;
				rev = rev * 10 + digit;
				temp = temp / 10;
			}
			int n = Math.abs(i - rev);
			if (n % z == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int result = beautifulDays(x, y, z);
		System.out.println(result);
		sc.close();
	}

}
