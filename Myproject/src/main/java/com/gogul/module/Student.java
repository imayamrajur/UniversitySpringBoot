package com.gogul.module;

public class Student {
	private int id;
	private String name;
	private String college;
	private String place;
	public Student(int id, String name, String college, String place) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.place = place;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCollege() {
		return college;
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
	public void setCollege(String college) {
		this.college = college;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", college=" + college + ", place=" + place + "";
	}
	
	
}
