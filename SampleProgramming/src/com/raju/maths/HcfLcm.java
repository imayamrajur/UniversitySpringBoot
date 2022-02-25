package com.raju.maths;

public class HcfLcm {
	public static int hcfSum(int a, int b) {

		if (b == 0) {
			return a;

		} else {
			return hcfSum(b, a % b);
		}

	}

	public static int lcmSum(int a, int b) {
		return ((a / hcfSum(a, b)) * b);
	}

}
