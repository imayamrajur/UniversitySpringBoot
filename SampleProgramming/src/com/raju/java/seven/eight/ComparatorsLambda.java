package com.raju.java.seven.eight;

import java.util.Comparator;

public class ComparatorsLambda {

	public static void main(String[] args) {
		Comparator<Integer> c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		};
		System.out.println(c1.compare(5, 15));
		
		Comparator<Integer> c2 = (a,b)-> a.compareTo(b);
		System.out.println(c2.compare(15, 5));

	}

}
