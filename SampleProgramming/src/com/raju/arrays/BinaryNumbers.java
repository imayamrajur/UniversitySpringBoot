package com.raju.arrays;

public class BinaryNumbers {

	public static void main(String[] args) {
		int num=16;
		int b=0;
		while(0<num) {
			b=num%2;
			num=num/2;
			System.out.print(b);
		}
		System.out.println(b);
	}

}
