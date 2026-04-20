package com.dsa.bitmanipulation;

import java.util.Scanner;

public class MaxConsecutiveOnes {
	static int consecutive(int n) {
		String s = "";
		while (n > 0) {
			int rem = n % 2;
			n /= 2;
			s = s + rem;
		}
		int maxCount = 0;
		int currCount = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				currCount++;
				maxCount = Math.max(maxCount, currCount);
			} else {
				currCount = 0;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = consecutive(n);
		System.out.println(result);
		sc.close();
	}

}
