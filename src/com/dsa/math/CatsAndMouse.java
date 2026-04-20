package com.dsa.math;

import java.util.Scanner;

public class CatsAndMouse {
	static String catsAndMouse(int a, int b, int c) {
		int catA = Math.abs(a - c);
		int catB = Math.abs(b - c);
		if (catA < catB) {
			return "Cat A";
		} else if (catB < catA) {
			return "Cat B";
		} else {
			return "Mouse C";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		String result = catsAndMouse(x, y, z);
		System.out.println(result);
		sc.close();
	}

}
