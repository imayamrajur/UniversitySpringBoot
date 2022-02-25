package com.raju.abstracts;

import java.util.Arrays;

public class AbstractMain {

	public static void main(String[] args) {
		Horse h = new Horse();		
		h.food();
		h.drinkWater();
		Lion l = new Lion();
		l.food();
		l.drinkWater();
		
		MyTest t1 = new MyTest("Raju", "Chengam");
		MyTest t2 = new MyTest("Raja", "Chengam");
		MyTest t3 = new MyTest("Sara", "Chengam");
		MyTest t4 = new MyTest("Ravi", "Chengam");
		
		MyTest[] list = new MyTest[4];
		list[0]=t1;
		list[1]=t2;
		list[2]=t3;
		list[3]=t4;
		
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i].getName()+" "+list[i].getPlace());
		}
		

	}

}
