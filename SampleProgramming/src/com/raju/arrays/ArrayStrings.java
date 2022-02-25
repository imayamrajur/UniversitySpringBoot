package com.raju.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStrings {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		String[] listName = new String[3];
		int i=0;
		while(i<listName.length) {
			System.out.print("Enter the Name "+(i+1)+":");
			listName[i]=s.next();
			i++;
		}
		
		Arrays.sort(listName);
		
		for(int j=0;j<listName.length;j++) {
			System.out.println(listName[j]);
			
		}
		
		for(int j=listName.length-1;j>0;j--) {
			System.out.println(listName[j]);
		}
	}

}
