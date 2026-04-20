package com.dsa.strings;

public class RemoveSpaces2 {

	public static void main(String[] args) {
		String str = "Hemanth is good boy";
		String result = str.replaceAll("\\s", "");
		System.out.println(result);
	}

}