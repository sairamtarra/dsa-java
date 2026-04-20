package com.dsa.misc;

import java.util.Scanner;

public class CompareTriplets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		int aResult = 0;
		int bResult = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i] < b[i]) {
				aResult++;
			} else if (a[i] > b[i]) {
				bResult++;
			}
		}
		System.out.println(bResult + " " + aResult);
	}
}