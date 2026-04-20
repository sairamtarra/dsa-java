package com.dsa.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int num = sc.nextInt();
			map.put(s, num);

		}
		while (sc.hasNext()) {
			String str = sc.next();
			if (map.containsKey(str)) {
				System.out.println(str + "=" + map.get(str));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}

}
