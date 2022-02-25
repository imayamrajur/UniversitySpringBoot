package com.raju.modul;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empId;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String doj;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getId() {
		return id;
	}
	public String getEmpId() {
		return empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDob() {
		return dob;
	}
	public String getGender() {
		return gender;
	}
	public String getDoj() {
		return doj;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
}
