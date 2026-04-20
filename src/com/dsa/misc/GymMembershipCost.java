package com.dsa.misc;

import java.util.Scanner;

public class GymMembershipCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of months");
		int n = sc.nextInt();
		sc.close();
		int dp[] = new int[n + 1];
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			dp[i] = dp[i - 1] + 2000;
			if (i >= 3) {
				dp[i] = Math.min(dp[i], dp[i - 3] + 5000);
			}
			if (i >= 6) {
				dp[i] = Math.min(dp[i], dp[i - 6] + 9000);
			}
		}
		System.out.println("Gym membership cost for " + n + " months is:" + dp[n]);
	}

}