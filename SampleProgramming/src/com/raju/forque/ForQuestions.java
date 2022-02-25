package com.raju.forque;

public class ForQuestions {
	public static void main(String[] args) {
		for(int i=20;i>1;i--) {
			if(i%10==0) {
				i=i-3;
			}
			System.out.print("\t"+i);
		}
		System.out.println("");
		
		for(int i=1;i<20;i++) {
			if(i%10==0) {
				i=i+3;
			}
			System.out.print("\t"+i);
		}
		System.out.println("");
		
		for(int i=1;i<20;i++) {
			System.out.print("\t"+i);
				i+=1;
			}
		System.out.println("");
		
		
	}

}
