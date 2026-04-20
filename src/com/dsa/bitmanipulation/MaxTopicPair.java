package com.dsa.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxTopicPair {
	static List<Integer> maxTopicCoverage(List<String> list) {
		int teams = 0;
		int maxTopic = 0;
		int n = list.size();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String s1 = list.get(i);
				String s2 = list.get(j);
				int count = 0;
				for (int k = 0; k < s1.length(); k++) {
					if (s1.charAt(k) == '1' || s2.charAt(k) == '1') {
						count++;
					}
				}
				if (count > maxTopic) {
					maxTopic = count;
					teams = 1;
				} else if (count == maxTopic) {
					teams++;
				}
			}
		}
		return Arrays.asList(maxTopic, teams);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		List<Integer> result = maxTopicCoverage(list);
		System.out.println(result);
		sc.close();
	}

}
