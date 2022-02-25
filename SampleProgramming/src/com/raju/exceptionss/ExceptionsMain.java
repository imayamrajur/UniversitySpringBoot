package com.raju.exceptionss;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsMain {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value :");
		try {
			int a = s.nextInt();
			System.out.println("Print Integer Value : " +a);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter the Value :");
		
		System.out.println("After Try Catch end");
		Tiger tiger = new Tiger();
		tiger.getDetails();
		throw new Exception();

	}

}
