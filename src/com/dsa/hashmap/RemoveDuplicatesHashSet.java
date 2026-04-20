package com.dsa.hashmap;

import java.util.HashSet;

public class RemoveDuplicatesHashSet {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 2, 4, 2, 6, 5, 7, 8, 1, 9, 3, 7 };
		HashSet<Integer> h = new HashSet<>();
		for (int num : arr) {
			h.add(num);
		}
		System.out.println(h);
	}

}