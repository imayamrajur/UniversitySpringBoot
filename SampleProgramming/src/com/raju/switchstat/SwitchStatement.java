package com.raju.switchstat;

public class SwitchStatement {

	public static void main(String[] args) {
		int a = 3;
		switch(a) {
		case 1:
			System.out.println("Pen");
			break;
		case 2:
			System.out.println("Pencel");
			break;
		case 3:
			System.out.println("Note");
			break;
		case 4:
			System.out.println("Book");
			break;
		case 5:
			System.out.println("Bag");
			default:
				System.out.println("Not Available");
		}

	}

}
