package com.dsa.strings;

import java.util.Scanner;

public class EvenOddFilter {
	static void evenOddStrings(int n, String arr[]) {
		for (int i = 0; i < n; i++) {
			char ch[] = arr[i].toCharArray();
			String even = "", odd = "";
			for (int j = 0; j < ch.length; j++) {
				if (j % 2 == 0)
					even += ch[j];
				else
					odd += ch[j];
			}
			System.out.println(even + " " + odd);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		evenOddStrings(n, arr);
		sc.close();
	}

}
