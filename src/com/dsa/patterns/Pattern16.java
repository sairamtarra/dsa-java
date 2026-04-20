package com.dsa.patterns;

public class Pattern16 {

	public static void main(String[] args) {
		for (char ch = 'A'; ch < 'A' + 5; ch++) {
			for (char j = 'A'; j <= ch; j++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

}
