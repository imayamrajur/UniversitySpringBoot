package com.raju.leet;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {17,11,2,7};
		int[] sz=new int[2];
		int target =9;
		for(int i=0;i<nums.length;i++) {
			for (int j=1;j<nums.length;j++) {
				if((nums[i]+nums[j])==target) {
					sz[0]=i;
					sz[1]=j;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(sz));
	}

}
