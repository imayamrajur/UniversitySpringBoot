package com.raju.abstra;

public class UseAnimalAbstr {

	public static void main(String[] args) {
		PetCat cat = new PetCat();
		cat.eat();
		cat.forest();
		cat.sleep();
		cat.sound();
		cat.notEat();
		System.out.println("_____________________");
		Animal ani = new PetCat();		
		ani.eat();
		ani.forest();
		ani.sleep();
		ani.sound();
		cat.notEat();

	}

}
