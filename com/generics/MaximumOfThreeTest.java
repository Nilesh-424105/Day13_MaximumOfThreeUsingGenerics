package com.generics;

public class MaximumOfThreeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Maximum Of Three Generic Program");

		// Creation Of Object
		MaximumOfThree maximumOfThree = new MaximumOfThree();
		// Method Calling
		Integer maxInt = maximumOfThree.testMaximum(20, 25, 15);
		Float maxFloat = maximumOfThree.testMaximum(10.2f, 11.3f, 10.5f);
		String maxString = maximumOfThree.testMaximum("Apple", "Banana", "Orange");
		// Print Result
		System.out.println("Maximum Integer is: " + maxInt);
		System.out.println("Maximum Float is: " + maxFloat);
		System.out.println("Maximum String is: " + maxString);

	}

}
