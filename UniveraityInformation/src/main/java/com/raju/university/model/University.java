package com.raju.university.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer univId;
	private String univName;
	private String univPlace;
	
	
	
	public Integer getUnivId() {
		return univId;
	}
	public String getUnivName() {
		return univName;
	}
	public String getUnivPlace() {
		return univPlace;
	}
	public void setUnivId(Integer univId) {
		this.univId = univId;
	}
	public void setUnivName(String univName) {
		this.univName = univName;
	}
	public void setUnivPlace(String univPlace) {
		this.univPlace = univPlace;
	}
	

}
