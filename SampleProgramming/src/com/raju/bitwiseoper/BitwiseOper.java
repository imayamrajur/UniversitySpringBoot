package com.raju.bitwiseoper;

public class BitwiseOper {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int c = 5;
		System.out.println((a>b)& (b<c));
		System.out.println((b>a)& (c<b));
		System.out.println((b<a)& (c<b));
		System.out.println((a>b)| (b<c));
		System.out.println((a<b)| (b<c));
		System.out.println((a>b)| (c<b));

	}

}
