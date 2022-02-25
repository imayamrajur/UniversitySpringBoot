package com.raju.hybired;

public class NewFamily implements SonParent,DaughterParent {

	@Override
	public void son() {
		System.out.println("Grand parent Son");
		
	}

	@Override
	public void daughter() {
		System.out.println("Grand parent Daughter");
		
	}

	@Override
	public void dSon() {
		System.out.println("Daugher of Son");
		
	}

	@Override
	public void dDaughter() {
		System.out.println("Daugher of Daughter");
		
	}

	@Override
	public void mySon() {
		System.out.println("Our Son");
		
	}

	@Override
	public void myDaughter() {
		System.out.println("Our Daughter");
		
	}

}
