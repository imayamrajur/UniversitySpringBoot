package com.raju.map;

import java.util.Arrays;
import java.util.List;

public class SteamMap {

	public static void main(String[] args) {

		//List<Integer> list = new ArrayList<>();
		List<Integer> list = Arrays.asList(3,13,19,29,59,11,7,5,91,97);
		
		//List<Integer> isPrime = list.stream().map()
		
		for(int a : list) {
			boolean isCheck=true;
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					isCheck=false;
				}
			}
			if(isCheck) {
				System.out.println(a+" is Prime Number");
			}else {
				System.out.println(a+" is not Prime Number");
				
			}
		}
		
		
		
	}

}
