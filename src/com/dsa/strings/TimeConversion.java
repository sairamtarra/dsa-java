package com.dsa.strings;

import java.util.Scanner;

public class TimeConversion {
	static String convertTime(String s) {
		String hour = s.substring(0, 2);
		String period = s.substring(8);
		if (period.equals("AM")) {
			if (hour.equals("12")) {
				hour = "00";
			}
		} else {
			if (!hour.equals("12")) {
				int h = Integer.parseInt(hour);
				h = h + 12;
				hour = String.valueOf(h);
			}
		}
		return hour + s.substring(2, 8);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = convertTime(s);
		System.out.println(result);
		sc.close();
	}

}
