package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {
	static String angryProfessor(int k, List<Integer> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 0) {
				count++;
			}
		}
		if (count <= k) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		String result = angryProfessor(k, list);
		System.out.println(result);
		sc.close();
	}

}
