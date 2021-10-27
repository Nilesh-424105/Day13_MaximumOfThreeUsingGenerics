package com.generics;

public class MaximumOfThreeTest {

	public static void main(String[] args) {

		System.out.println("Welcome To Maximum Of Three Generic Program");

		// Creation Of Object
		MaximumOfThree maximumOfThree = new MaximumOfThree(10.3f, 10.2f, 10.5f);
		// Method Calling
		Float max = maximumOfThree.testMaximum();
		// Print Result
		System.out.println("Maximum Float Number is: " + max);
	}

}
