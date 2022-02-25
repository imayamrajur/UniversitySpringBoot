package com.raju.logicalOper;

public class LogicalOper {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 5;
		System.out.println((a>b)&& (b<c));
		System.out.println((b>a)&& (c<b));
		System.out.println((a>b)|| (b<c));
		System.out.println((a<b)|| (b<c));
		System.out.println((a>b)|| (c<b));

	}

}
