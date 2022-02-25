package com.raju.collections;

import java.util.List;

public class PrimeList {

	public static void main(String[] args) {
		ListUtil listobject = new ListUtil();
		List<Integer> listValue = listobject.getListInteger();

		for (int s : listValue) {
			int m, flag = 0;
			m = s / 2;
			if (s == 0 || s == 1) {
				System.out.println("Not Prime Number :" + s);
			} else {
				for (int i = 2; i <= m; i++) {
					if (s % i == 0) {
						System.out.println("Not Prime Number :" + s);
						flag = 1;
						break;

					}
				}
			}

			if (flag == 0) {
				System.out.println("Prime Number :" + s);
			}
		}

	}

}
