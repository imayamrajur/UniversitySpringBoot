package com.raju.vendar;


public class VendorMechine {

	public static void main(String[] args) {
			
		
		ProductSell sell = new ProductSell();
		sell.showProductList();
		System.out.println("Machine Accept Only Rs 5, 10, 20, 50, 100");
		sell.getRunTimeAmount();

	}

}
