package com.raju.collections;

import java.util.Iterator;
import java.util.List;

public class UtilListOperation {

	ListUtil listUtil = new ListUtil();
	List<Integer> listInt = listUtil.getListInteger();
	List<String> list = listUtil.getListString();

	public void getListNormal() {
		System.out.println("---------Normal---------");

		list.forEach(day -> System.out.println(day));
	}

	public void getListCamelCase() {
		System.out.println("---------CamelCase---------");

		list.forEach(days -> {
			String ch = days.substring(0, 1);
			String firstUpper = ch.toUpperCase();
			String rest = days.substring(1, days.length());
			String toLow = rest.toLowerCase();
			System.out.println(firstUpper + toLow);
		});
	}

	public void getListFirstThreeUpperCase() {
		System.out.println("---------First Three Letter UpperCase---------");

		list.forEach(toUp -> {
			String firstThree = toUp.substring(0, 3);
			String toUpper = firstThree.toUpperCase();
			System.out.println(toUpper);
		});
	}

	public void getListNormalLoop() {
		System.out.println("---------Normal For Loop to LowerCase---------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toLowerCase());
		}
	}

	public void getListToUppWhile() {
		System.out.println("--------ToUpperCase using While----------");

		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i).toUpperCase());
			i++;
		}
	}

	public void getListIterateWhile() {
		System.out.println("--------Iterator using While----------");

		Iterator<String> its = list.iterator();
		int a = 0;
		while (a < list.size()) {
			System.out.println(its.next());
			a++;
		}
	}

	String dayList[];

	public void getListConvertArray() {
		System.out.println("-------Convert to Array Print-----------");
		int sizes = list.size();
		String dayList[] = new String[sizes];
		for (int j = 0; j < list.size(); j++) {

			dayList[j] = list.get(j);
			System.out.println(dayList[j]);
		}

		System.out.println("-------- Enhence For loop----------");
		for (String day : dayList) {
			System.out.println("Days :" + day);
		}
	}

	public void getNormal() {
		System.out.println("---------Normal List-----------");

		listInt.forEach(a -> System.out.println(a));
	}

	public void getEven() {
		System.out.println("---------Even Number-----------");

		for (int s : listInt) {
			if (s % 2 == 0) {
				System.out.println("Even Number  : " + s);
			}
		}
	}

	public void getOdd() {
		System.out.println("---------Odd Number-----------");

		for (int s : listInt) {
			if (s % 2 == 1) {
				System.out.println("Odd Number  : " + s);
			}
		}
	}

	public void getSquare() {
		System.out.println("---------Squar-------------");

		for (int num : listInt) {
			boolean squar = false;
			for (int i = 1; i < num; i++) {
				int j = i * i;
				if (j == num) {
					// System.out.println(i + " Square is " + num);
					squar = true;
					break;

				}

			}

			if (squar == true) {
				System.out.println(" Square is :" + num);
			} else {
				System.out.println(" Not Square  :" + num);
			}
		}

	}

	public void getPrime() {
		List<Integer> listInt = listUtil.getListInteger();
		System.out.println("---------Prime number or Not -------------");

		for (int s : listInt) {
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
