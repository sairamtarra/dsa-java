package com.dsa.math;

import java.util.Scanner;

public class DayOfTheProgrammer {
	static String dayOfTheProgrammer(int year) {
		if (year == 1918) {
			return "26.09." + year;
		} else if (year < 1918 && year % 4 == 0) {
			return "12.09." + year;
		} else if (year > 1918 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			return "12.09." + year;
		} else {
			return "13.09." + year;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String result = dayOfTheProgrammer(year);
		System.out.println(result);
		sc.close();
	}

}