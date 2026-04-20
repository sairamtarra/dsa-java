package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyTransform {

	public static void main(String[] args) {
		String str = "aaabbccc";
		Map<Character, Integer> map = new HashMap<>();
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (Character key : map.keySet()) {
			System.out.print(key + "" + map.get(key));
		}
	}

}