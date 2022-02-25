package com.gogul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gogul.module.Student;
import com.gogul.service.StudentService;

@RestController
@RequestMapping("/sample")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/hello")
	public List<Student> getStudentDetails(){
		return studentService.getStudentDetails();
	}
}
