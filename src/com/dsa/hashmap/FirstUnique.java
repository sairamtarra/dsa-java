package com.dsa.hashmap;

public class FirstUnique {

	public static void main(String[] args) {
		String s = "aabcgdhfgrtyusggfhbvhbv";
		for (int i = 0; i < s.length(); i++) {
			boolean found = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					found = false;
					break;
				}
			}
			if (found) {
				System.out.println("Unique elements int the String is:" + s.charAt(i));
				break;
			}
		}
	}

}