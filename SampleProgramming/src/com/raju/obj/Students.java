package com.raju.obj;

public class Students {
	private int id;
	private String name;
	private Address address;
	private Sports sportsList;
		
	public Students(int id, String name, Address address, Sports sportsList) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.sportsList = sportsList;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public Sports getSportsList() {
		return sportsList;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setSportsList(Sports sportsList) {
		this.sportsList = sportsList;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", address=" + address + ", sportsList="
				+ sportsList + "]";
	}
	
	

}
