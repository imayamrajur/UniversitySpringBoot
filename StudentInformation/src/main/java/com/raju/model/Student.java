package com.raju.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String studentRegNo;
	private String studentName;
	private String studentFName;
	private String studentDOB;
	private String studentGender;
	private String studentDept;
	private String studentBranch;
	private String studentMailId;
	private String studentContactNo;
	private String studentAddress;
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentRegNo() {
		return studentRegNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentFName() {
		return studentFName;
	}
	
	public String getStudentDOB() {
		return studentDOB;
	}
	
	public String getStudentGender() {
		return studentGender;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public String getStudentMailId() {
		return studentMailId;
	}
	public String getStudentContactNo() {
		return studentContactNo;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentRegNo(String studentRegNo) {
		this.studentRegNo = studentRegNo;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}
	
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}
	public void setStudentContactNo(String studentContactNo) {
		this.studentContactNo = studentContactNo;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	

}
