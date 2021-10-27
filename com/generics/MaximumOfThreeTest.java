package com.generics;

public class MaximumOfThreeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Maximum Of Three Generic Program");

		// Creation Of Object
		MaximumOfThree maximumOfThree = new MaximumOfThree(122, 128, 120);
		// Method Calling
		Integer max = maximumOfThree.testMaximum();
		// Print Result
		System.out.println("Maximum Number is: " + max);
	}

}
