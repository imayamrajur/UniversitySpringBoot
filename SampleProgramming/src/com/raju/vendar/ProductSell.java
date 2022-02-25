package com.raju.vendar;

import java.util.Scanner;

public class ProductSell {
	
	private double totalAmount;
	private double totalBarrowAmount;

	public void showProductList() {
		System.out.println("Product Price List");
		System.out.println("1.Coke Price Rs: 25");
		System.out.println("2.Pepse Price Rs: 35");
		System.out.println("3.Soda Price Rs: 45");
	}
 
	public double addAmount(double amount) {
		totalAmount+=amount;
		System.out.println("Total Amount :" +totalAmount);
		return totalAmount;
		
	}

	public void getAmount(double amount) {
		//System.out.println("Machine Accept Only Rs 5, 10, 20, 50, 100");
		
		if (amount == 5 || amount == 10 || amount == 20 || amount == 50 || amount == 100) {

			//if (amount < 25) {
				addAmount(amount);
				if(totalAmount<25) {
				getRunTimeAmount();
				}else {
					productList();
				}
			//} else if (amount >= 25) {
				
			//}
		}else {
			System.out.println("Machine Accept Only Rs 5, 10, 20, 50, 100");
			getRunTimeAmount();
		}

		
	}
	
	public void getRunTimeAmount() {
		Scanner s = new Scanner(System.in);
		System.out.println("Give Amount:");
		double amount = s.nextDouble();
		getAmount(amount);
	}
	
	public void productList() {
		System.out.println("Product List");
		System.out.println("1.Coke");
		System.out.println("2.Pepse");
		System.out.println("3.Soda");
		System.out.println("4.OK");
		System.out.println("5.Cancel");
	}
	
	public void getProduct(int choose) {
		switch(choose) {
		case 1:
			buyCoke();
		}
		
	}
	public void buyCoke(){
		
	}

}
