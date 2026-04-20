package com.dsa.misc;

import java.util.Scanner;

public class EmotionalStateSimulation {
	static void emotionalState(int N, int k) {
		int happy = N;
		int sad = 0;
		for (int i = 0; i < k; i++) {
			int newHappy = (int) (0.3 * happy + 0.5 * sad);
			int newSad = (int) (0.7 * happy + 0.5 * sad);
			happy = newHappy;
			sad = newSad;
		}
		System.out.println(happy + " " + sad);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter happy people:");
		int N = sc.nextInt();
		System.out.println("Enter no of iterations");
		int k = sc.nextInt();
		sc.close();
		emotionalState(N, k);

	}

}