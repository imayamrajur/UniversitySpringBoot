package com.raju.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		InterfaceSample is = (int a)->System.out.println(a);
		is.getIt(50);
		is.getIt(20);
		InterfaceSample s = (a)->System.out.println(a);
		s.lamp("Raju");
		s.lamp("Sara");

	}

	

}
