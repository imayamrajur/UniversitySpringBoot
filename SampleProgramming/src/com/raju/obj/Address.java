package com.raju.obj;

public class Address {
	private int doNo;
	private String street;
	
	public Address(int doNo, String street) {
		
		this.doNo = doNo;
		this.street = street;
	}
	public int getDoNo() {
		return doNo;
	}
	public String getStreet() {
		return street;
	}
	public void setDoNo(int doNo) {
		this.doNo = doNo;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [doNo=" + doNo + ", street=" + street + "]";
	}
	
	

}
