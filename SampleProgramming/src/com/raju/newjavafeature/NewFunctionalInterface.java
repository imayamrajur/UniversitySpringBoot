package com.raju.newjavafeature;


public interface NewFunctionalInterface {
	
	public void desplay(int val);
	
	
	public static String getMyName(String name) {
		System.out.println("Static interface Methods" +name);
		return name;
	}
	
	public default void getPlace() {
		System.out.println("Default Interface method");
	}
	

}
