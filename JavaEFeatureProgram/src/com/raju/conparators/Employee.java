package com.raju.conparators;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private String place;
	private int salary;
	//private List<String> sportsList;
		
	public Employee(int id, String name, String place, int salary) {
		this.id = id;
		this.name = name;
		this.place = place;
		this.salary = salary;
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", place=" + place + ", salary=" + salary + "]";
	}
	
	
	

}
