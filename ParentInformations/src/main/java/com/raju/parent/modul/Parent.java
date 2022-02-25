package com.raju.parent.modul;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parentId;
	private String fatherName;
	private String motherName;
	private String place;
	
	public Integer getParentId() {
		return parentId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public String getPlace() {
		return place;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
