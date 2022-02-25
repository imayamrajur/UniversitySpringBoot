package com.raju.swapdesc;

public class AscOrder {

	public static void main(String[] args) {
		int a[] = { 10, 5, 11, 8, 15 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}

}
