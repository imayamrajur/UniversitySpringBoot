package com.raju.modul;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="file_resume")
public class FileResume {
	@Id
	@GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
	@GenericGenerator(name="uuid",strategy = "uuid2")
	private String id;
	private String fileName;
	private String fileType;
	@Lob
	private byte[] fileData;	
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="employeeId")
	private Employee employee;
	
		
	public FileResume(String id, String fileName, String fileType, byte[] fileData) {
		
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileData = fileData;
		
	}
	public String getId() {
		return id;
	}
	public String getFileName() {
		return fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	public byte[] getFileData() {
		return fileData;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
