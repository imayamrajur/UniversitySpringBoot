package com.raju.service;

import java.util.List;

import com.raju.model.Student;

public interface StudentService {
	
	public void addStudentDetails(Student student);
	public void editStudentDetails(Student student, String regNo);
	public void deleteStudentDetails(String regNo);
	public Student findOneId(String regNo);
	public List<Student> findAllStudentDetails();


}
