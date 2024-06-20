package com.java8.practice;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		/**
		 * Difference between StringJoiner and StringBuilder.
		 */

		/**
		 * StringJoiner 2 constructors, 1. with delimiter
		 * and other StringJoiner takes, delimiter, prefix and suffix.
		 */
		StringJoiner skillSet = new StringJoiner(",", "(", ")");
		skillSet.add("Java");
		skillSet.add("C");
		skillSet.add("Python");
		skillSet.add("AWS");
		skillSet.add("SQL");

		System.out.println(skillSet);
		
		skillSet = new StringJoiner(",");
		skillSet.add("Java");
		skillSet.add("C");
		skillSet.add("Python");
		skillSet.add("AWS");
		skillSet.add("SQL");

		System.out.println(skillSet);
		
	}

}
