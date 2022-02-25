package com.raju.inheritancesingle;

import java.util.HashSet;

public final class Dog extends Animal{
	public void food() {
		eat();
		sound();
		foods();
		
		System.out.println("Foods Methods");
	}
	
	HashSet<Integer> set = new HashSet<>();
	

}
