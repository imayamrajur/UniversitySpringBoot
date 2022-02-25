package com.raju.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

	public static void main(String[] args) {
		List<Integer> nList = new ArrayList<>();
		String listN = args[0];
		String[] list = listN.split(",");
		int r[] = new int[14];
		for(int i=0;i<list.length;i++) {
			r[i]=Integer.parseInt(list[i]);
			nList.add(r[i]);
			//System.out.println(r[i]);
		}
		
				
		for(int s : nList) {
			if(s%2==0) {
				System.out.print(s+"-EVEN ");
			}else {
				System.out.print(s+"-ODD ");
			}
		}

	}

}
