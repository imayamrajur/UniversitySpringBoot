package com.raju.lms;

public class Fact {
	
	public void checkNumber(int num) {
		int m, flog=0;
		m=num/2;
		if(num==0 || num==1) {
			System.out.println(num+" NOT PRIME");
		}else {
			for(int i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println(num+" NOT PRIME");
					flog=1;
					break;
				}
			}
			if(flog==0) {
				System.out.println(num+" PRIME");
			}
		}
	}

	public static void main(String[] args) {
		
		Fact f = new Fact();
		for(int i=0;i<=100;i++) {
			f.checkNumber(i);
		}
		
		//f.checkNumber(24);
		//f.checkNumber(113);
		
		
		/*
		 * if((num%2==0) || (num%3==0) || (num%5==0) || (num%7==0) || (num%11==0) ) {
		 * System.out.println("NOT PRIME"); }else { System.out.println("PRIME"); }
		 */
		/*
		 * int a = 0; if (a > 0) { for (int i = 1; i <= a; i++) { if (i == 7) { if (i %
		 * 7 == 0) { System.out.println("PRIME"); } } if (i == 24) { if ((i % 24 == 0)
		 * && (i % 2 == 0)) { System.out.println("NOT PRIME"); } } }
		 * 
		 * } else { System.out.println("INVALID"); }
		 */

	}

}
