package com.raju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.dao.StudentDAO;
import com.raju.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDAO studentDAO;

	@Override
	public void addStudentDetails(Student student) {
		studentDAO.addStudentDetails(student);
		
	}

	@Override
	public void editStudentDetails(Student student, String regNo) {
		studentDAO.editStudentDetails(student, regNo);
		
	}

	@Override
	public void deleteStudentDetails(String regNo) {
		studentDAO.deleteStudentDetails(regNo);
		
	}

	@Override
	public Student findOneId(String regNo) {
		
		return studentDAO.findOneId(regNo);
	}

	@Override
	public List<Student> findAllStudentDetails() {
		
		return studentDAO.findAllStudentDetails();
	}
	
	

}
