package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEquation {
	static List<Integer> sequenceEquation(List<Integer> p) {
		int n = p.size();
		int index[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			index[p.get(i)] = i + 1;
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int pos1 = index[i];
			int pos2 = index[pos1];
			result.add(pos2);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> p = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		List<Integer> result = sequenceEquation(p);
		System.out.println(result);
		sc.close();
	}

}
