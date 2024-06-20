package com.java8.practice;

import java.util.Random;

public class RandomNumerTest {

	public static void main(String[] args) {
		/**
		 * Print 10 random numbers
		 */
		Random randomNumGenerator = new Random();
		
		randomNumGenerator.ints(10).forEach(System.out::println);
		
		/**
		 * Use inboud and outbound --
		 */
		randomNumGenerator.ints(1, 10).limit(5).forEach(System.out::println);
		
		/**
		 * Sort the numbers!
		 */

		randomNumGenerator.ints(1, 100).limit(10).sorted().forEach(System.out::println);;
		
	}

}
