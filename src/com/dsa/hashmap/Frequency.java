package com.dsa.hashmap;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		String s = "banana";
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
	}

}