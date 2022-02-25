package com.raju.forloop;

import java.util.ArrayList;
import java.util.Collections;

import com.raju.maps.College;

public class ForLoop {

	static {
		System.out.println("Hi Onesoft");
	}

	public static void main(String[] args) {
		
		for(char a = 65;a<70;a++) {
			System.out.print("\t "+a);
		}
		
		int a=100;
		int b=20;
		float r=20.0f;
		float s =a/b;
		System.out.println(s);

		int i = 0;
		for (;; i++) {
			if (i < 10) {
				System.out.println(i);
				i++;
				++i;
				i++;
			} else {
				break;
			}
		}

		for (int j = 0; j < 10; j++) {
			System.out.print("\t" + (j + 1));

		}
		System.out.println("");
		System.err.println("Raju R");

		System.out.println("--------------------List--------------");
		College col = new College(1001, "Anna University", "Chennai");
		ArrayList list = new ArrayList();
		list.add("Raju");
		list.add(20);
		list.add("Sara");
		list.add(80);
		list.add(col);

		for (int numer = 0; numer < list.size(); numer++) {
			System.out.println(list.get(numer));
		}

		System.out.println("--------------------List Object toString()--------------");

		for (Object o : list) {
			System.out.println(o.toString());
		}

		System.out.println("--------------------List Object--------------");

		for (Object o : list) {
			System.out.println(o);
		}

	}

}
