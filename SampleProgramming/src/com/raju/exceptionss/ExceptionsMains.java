package com.raju.exceptionss;

public class ExceptionsMains {
	static volatile int a=10;
	volatile int b=2;
	int c = 2;
	public static void main(String[] args) {
		a=20;
		System.out.println(a);
		ExceptionsMains ss = new ExceptionsMains();
		ss.display();
		ss.displays();
		ss.dis();
	}
	public void display() {
		a=30;
		System.out.println(a);
		System.out.println(b++);
		System.out.println(c++);
	}
	public void displays() {
		a=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public synchronized void dis() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
