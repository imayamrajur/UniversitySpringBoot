package com.raju.arrays;

public class RevNumber {

	public static void main(String[] args) {
		int num=192;
		int b=0;
		int c=0;
		while(0<num) {
			b=num%10+b*10;
			num=num/10;
			
		}
		System.out.println(b);
	}

}
