package com.raju.arrays;

public class IntBinarys {

	public static void main(String[] args) {
		int num = 16;
		String bin = "";
		int c=3;
		int r=13;
		while (num > 0) {
			bin = ((num & 1) == 0 ? '0' : '1') + bin;
			//num=num/2;
			num >>= 1;
		}
		System.out.println(bin);
		System.out.println((r & c));
	}

}
