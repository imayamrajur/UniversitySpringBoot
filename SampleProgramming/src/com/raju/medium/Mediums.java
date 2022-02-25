package com.raju.medium;

import java.util.Arrays;

public class Mediums {

	public static void main(String[] args) {
		int[] val = { 6, 4, 2, 5, 3, 7, 9, 8 };
		int s = val.length;
		float medium = 0;
		Arrays.sort(val);
		if(s%2==1) {
			medium = val[s/2];
		}else {
			medium =(float) (val[(s-1)/2]+val[s/2])/2;
		}
		System.out.println(medium);
		for(int i=0;i<s;i++) {
			System.out.print(" "+val[i]+" ");
		}
	}

	
}
