package com.raju.exceptionss;

import com.raju.exceptions.Animal;


public class Tiger extends Animal {
	//Animal animal = new Animal();
	//animal.display();
	//@SuppressWarnings("static-access")
	public void getDetails() {
		System.out.println("normal mathed access to Normal");
		super.display();
	}

}
