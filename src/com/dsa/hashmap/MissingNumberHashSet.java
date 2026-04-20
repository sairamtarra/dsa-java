package com.dsa.hashmap;

import java.util.HashSet;

public class MissingNumberHashSet {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		for (int i = 1; i < arr.length; i++) {
			if (!set.contains(i)) {
				System.out.println("Missing number is:" + i);
			}
		}
	}

}