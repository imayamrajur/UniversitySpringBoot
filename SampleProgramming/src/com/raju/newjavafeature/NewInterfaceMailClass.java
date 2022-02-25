package com.raju.newjavafeature;

import java.io.IOException;
import java.util.Scanner;

public class NewInterfaceMailClass extends NewInterfaceImpl{
	
	public int add(int a, int b) throws IOException {
		System.out.println("Sub Class");
		return b+a;
		
	}

	public static void main(String[] args) {
		
		try {
			
			
			Scanner s = new Scanner(System.in);
			NewInterfaceImpl nif = new NewInterfaceImpl();
			System.out.println(NewFunctionalInterface.getMyName("Sara"));
				try {
			System.out.println("Enter value :");
			int a = s.nextInt();
			//System.exit(0);
			nif.desplay(a);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("inner Final");
				}
				//System.exit(0);
			System.out.println(NewFunctionalInterface.getMyName("Sara"));
			
			nif.getPlace();
			NewInterfaceMailClass tt= new NewInterfaceMailClass();
			System.out.println(tt.add(20, 30));
			
			
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
					System.out.println("Finally");
					
				}
		
	}

	
}
