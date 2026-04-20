package com.dsa.misc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BillDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		int charge = sc.nextInt();
		sc.close();

		list.remove(b);
		int sum = 0;
		for (int n : list) {
			sum += n;
		}
		int actual = sum / 2;
		if (charge == actual) {
			System.out.println("Bon Appetit");
		} else if (charge > actual) {
			System.out.println(charge - actual);
		}
	}

}