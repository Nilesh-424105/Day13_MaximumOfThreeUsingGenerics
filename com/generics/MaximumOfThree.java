package com.generics;

public class MaximumOfThree {

	private Integer x, y, z, max;

	// Create Parameterize Constructor
	public MaximumOfThree(Integer x, Integer y, Integer z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// Create Method For Find Maximum Of Three
	public Integer testMaximum() {
		max = x;
		if (y.compareTo(x) > 0)
			max = y;
		else if (z.compareTo(y) > 0)
			max = z;
		return max;
	}
}
