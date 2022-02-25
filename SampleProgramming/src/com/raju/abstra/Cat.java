package com.raju.abstra;

public abstract class Cat extends Animal {

	@Override
	void eat() {
		System.out.println("Milk Fish Dry fish");
		
	}

	@Override
	void sound() {
		System.out.println("Miyam miyam");
		
	}

	@Override
	void sleep() {
		System.out.println("Sleep anyware in Top");
		
	}

	@Override
	void walk() {
		System.out.println("silent Walking");
		
	}
	
	abstract void notEat();

}
