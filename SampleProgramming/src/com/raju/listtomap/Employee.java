package com.raju.listtomap;

public class Employee {
	private int empId;
	private String empName;
	private String empDest;
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDest() {
		return empDest;
	}
	public void setEmpDest(String empDest) {
		this.empDest = empDest;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return empId+" "+empName+" "+empDest+" "+salary;
	}
	
	

}
