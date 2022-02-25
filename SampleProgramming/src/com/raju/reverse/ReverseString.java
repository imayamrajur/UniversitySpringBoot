package com.raju.reverse;

import java.util.Scanner;

public class ReverseString {
	
	static void reverseString(char[] na, int le) {
		if(le>0) {
			System.out.print(na[le-1]);
			le--;
			reverseString(na,le);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String :");
		String name = s.next();
		char[] nam = name.toCharArray();
		int len = nam.length;
		
		reverseString(nam,len);

	}

}
