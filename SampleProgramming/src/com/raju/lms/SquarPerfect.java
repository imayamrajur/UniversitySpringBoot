package com.raju.lms;

import java.util.Scanner;

public class SquarPerfect {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int sq = (int) Math.sqrt(num);
		
		System.out.printf("%d\n", sq);
		
		for(int i=1;i*i<num;i++) {
			if((num%i==0)&&(num/i==1)) {
				
				System.out.println(i);
			}
		}
		
		System.out.println(num);
	}

}
