package com.raju.sample;

public class TypeVeriable {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		int c = 30;
		TypeVeriable tv = new TypeVeriable();
		System.out.println("Instance Variable = "+(tv.a+c));
		System.out.println("Static Variable = "+b);
		System.out.println("Local Variable = "+(c+b));

	}

}
