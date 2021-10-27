package com.generics;

public class MaximumOfThree {

	private Float x, y, z, max;

	// Create Parameterize Constructor
	public MaximumOfThree(Float x, Float y, Float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Float testMaximum() {
		max = x;
		if (y.compareTo(x) > 0)
			max = y;
		else if (z.compareTo(y) > 0)
			max = z;
		return max;
	}
}
