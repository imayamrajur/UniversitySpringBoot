package com.raju.hcf;

public class HcfSum {
	
	public static int hcfSum(int a, int b) {
		
		if(b==0) {
			return a;
		
		}else {
			return hcfSum(b,a%b);
		}
		
	}
	
	public static int lcmSum(int a, int b) {
		return ((a/hcfSum(a,b))*b);
	}

	public static void main(String[] args) {
		int a=13,b=24;
		System.out.println("HCF is a= "+a+" and b= "+b+" is "+hcfSum(a,b));
		System.out.println("LCM is a= "+a+" and b= "+b+" is "+lcmSum(a,b));

	}

}
