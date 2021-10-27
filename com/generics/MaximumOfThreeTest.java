package com.generics;

public class MaximumOfThreeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Maximum Of Three Generic Program");

		// Creation Of Object
		MaximumOfThree maximumOfThree = new MaximumOfThree("Apple", "Banana", "Orange");
		// Method Calling
		String max = maximumOfThree.testMaximum();
		// Print Result
		System.out.println("Maximum String is: " + max);
	}

}
