package com.raju.future;

@FunctionalInterface
public interface FutureInterface {
	public void getDetails();
	public default void getDetail() {
		System.out.println("Interface Default method");
	}
	public static void getEmployee() {
		System.out.println("Interface Static Implements Method");
		
	}
	//public void raju();

}
