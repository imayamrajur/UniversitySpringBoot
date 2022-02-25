package com.raju.lms;

public class UppCaseCompare {

	public static void main(String[] args) {
		String name = "IMAYAM RAJU";
		String names = name.toUpperCase();
		if(name.equals(names)) {
			System.out.println("ALL UPPER");
		}else {
			System.out.println("Camel Case");
		}
	}

}
