package com.generics;

public class MaximumOfThree {

	// Create Generic Method To Find Maximum Of Three
	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(x) > 0)
			max = y;
		else if (z.compareTo(y) > 0)
			max = z;
		return max;

	}

}
