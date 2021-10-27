package com.generics;

public class MaximumOfThree {

	private String x, y, z, max;

	// Create Parameterize Constructor
	public MaximumOfThree(String x, String y, String z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// Create Method To Find Maximum Of Three String
	public String testMaximum() {
		max = x;
		if (y.compareTo(x) > 0)
			max = y;
		else if (z.compareTo(y) > 0)
			max = z;
		return max;
	}
}
