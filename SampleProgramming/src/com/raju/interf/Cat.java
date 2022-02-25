package com.raju.interf;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Milk Fish Dry fish");
		
	}

	@Override
	public void sound() {
		System.out.println("Miyam miyam");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep anyware in Top");
		
	}

	@Override
	public void walk() {
		System.out.println("silent Walking");
		
	}
	public void homePet() {
		System.out.println("Frindly with Humans");
	}

}
