package com.raju.arrays;

public class ArrayLenths {

	public static void main(String[] args) {
		int li[] = new int[100];
		int i=0;
		
		while(i<100) {
			if(i%3==0 && i%7==0) {
				li[i]=i;
			}else if(i%3==0 || i%7==0) {
				li[i]=i;
			}
			i++;
		}
	
		int j=0;
		while(j<li.length) {
			if(li[j]!=0) {
				System.out.println(li[j]*li[j]);
				
			}
			j++;
		}
 	}

}
