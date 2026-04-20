package com.dsa.math;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		long factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		System.out.println("The factorial of " + n + " is " + factorial);
		sc.close();
	}

}