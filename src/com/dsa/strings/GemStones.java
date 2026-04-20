package com.dsa.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GemStones {
	static int stringCount(List<String> list) {
		int count[] = new int[26];
		int n = list.size();
		for (String str : list) {
			boolean seen[] = new boolean[26];
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				int index = ch - 'a';
				if (!seen[index]) {
					seen[index] = true;
					count[index]++;
				}
			}
		}
		int result = 0;
		for (int i = 0; i < 26; i++) {
			if (count[i] == n) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		int result = stringCount(list);
		System.out.println(result);
		sc.close();
	}

}
