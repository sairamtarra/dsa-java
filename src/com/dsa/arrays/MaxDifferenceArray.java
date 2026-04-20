package com.dsa.arrays;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maxDifference;

	Difference(int[] elements) {
		this.elements = elements;
	}

	void maxDifference() {
		int min = elements[0];
		int max = elements[0];
		for (int i = 1; i < elements.length; i++) {
			if (elements[i] < min) {
				min = elements[i];
			}
			if (elements[i] > max) {
				max = elements[i];
			}
		}
		maxDifference = max - min;
	}
}

public class MaxDifferenceArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Difference d = new Difference(arr);
		d.maxDifference();
		System.out.println("Maximum Difference is:" + d.maxDifference);
		sc.close();
	}

}
