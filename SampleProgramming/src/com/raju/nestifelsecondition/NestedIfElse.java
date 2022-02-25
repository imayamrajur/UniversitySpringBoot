package com.raju.nestifelsecondition;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		if(a>20) {
			if(b>50) {
				System.out.println("Success");
			}else {
				System.out.println("Second Failer");
			}
		}else {
			System.out.println("First Failer");
		}

	}

}
