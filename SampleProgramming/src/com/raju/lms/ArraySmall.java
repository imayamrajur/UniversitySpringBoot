package com.raju.lms;

public class ArraySmall {

	public static void main(String[] args) {
		int a[] = { 5, 9, 2, 7, 3, 8, 4, 1, 6 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);

	}

}
