package com.raju.arrayobj;

import java.util.Arrays;

public class Student {

	private int regNo;
	private String name;
	private String dept;
	private Address[] address;

	public Student(int regNo, String name, String dept, Address[] address) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getRegNo() {
		return regNo;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", dept=" + dept + ", address=" + Arrays.toString(address)
				+ "]";
	}

}
