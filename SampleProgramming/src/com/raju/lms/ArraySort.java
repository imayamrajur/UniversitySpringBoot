package com.raju.lms;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = { 5, 9, 2, 7, 3, 8, 4, 1, 6 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

	}

}
