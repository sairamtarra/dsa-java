package com.dsa.strings;

public class RemoveSpaces3 {

	public static void main(String[] args) {
		String s = "springboot is a framework";
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (c != ' ') {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}