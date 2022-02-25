package com.raju.collections;

import java.util.ArrayList;
import java.util.List;

public class ListPrime {

	public static void main(String[] args) {
		ListPrime obj = new ListPrime();
		List<Integer> nList = new ArrayList<>();
		// String listN = args[0];
		String listN = "3,6,5,8,7,9,11";
		String[] list = listN.split(",");
		int r[] = new int[14];
		for (int i = 0; i < list.length; i++) {
			r[i] = Integer.parseInt(list[i]);
			nList.add(r[i]);
		}
		
		for(int i=0;i<nList.size();i++) {
			int val = nList.get(i);
		
			boolean check = obj.isPrime(val);
			if(i>0) {
				System.out.print(",");
			}
			
			if (check) {
				System.out.print(val + "-PRIME");
				

			} else {
				System.out.print(val + "-NOT PRIME");
				
			}

		}

	}

	public boolean isPrime(int val) {
		int m;
		boolean flag = true;
		m = val / 2;
		if (val == 0 || val == 1) {
			flag = false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (val % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

}
