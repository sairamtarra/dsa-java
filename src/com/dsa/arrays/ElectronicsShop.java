package com.dsa.arrays;

import java.util.Scanner;

public class ElectronicsShop {
	static int highestBudget(int b, int[] kb, int[] usb) {
		int max = -1;
		int total = 0;
		for (int i = 0; i < kb.length; i++) {
			for (int j = 0; j < usb.length; j++) {
				total = kb[i] + usb[j];
				if (total <= b) {
					max = Math.max(total, max);
				}
			}
		}
		if (max == -1) {
			return max;
		} else {
			return max;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int budget = sc.nextInt();
		int keys = sc.nextInt();
		int keyboards[] = new int[keys];
		int usbs = sc.nextInt();
		int usb[] = new int[usbs];
		for (int i = 0; i < keys; i++) {
			keyboards[i] = sc.nextInt();
		}
		for (int i = 0; i < usbs; i++) {
			usb[i] = sc.nextInt();
		}
		int result = highestBudget(budget, keyboards, usb);
		System.out.println(result);
		sc.close();
	}

}
