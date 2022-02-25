package com.raju.collections;

import java.util.List;

public class SquareValue {

	public static void main(String[] args) {
		ListUtil listobject = new ListUtil();
		List<Integer> listValue = listobject.getListInteger();

		for (int num : listValue) {
			boolean squar = false;
			for (int i = 1; i < num; i++) {
				int j = i * i;
				if (j == num) {
					// System.out.println(i + " Square is " + num);
					squar = true;
					break;

				}

			}

			if (squar) {
				System.out.println(" Square is :" + num);
			} else {
				System.out.println(" Not Square  :" + num);
			}
		}

	}

}
