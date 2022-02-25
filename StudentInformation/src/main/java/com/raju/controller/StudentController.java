package com.raju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.model.Student;
import com.raju.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/save")
	public void addStudentDetails(@RequestBody Student student) {
		
		studentService.addStudentDetails(student);
	}
	
	@PutMapping("/update/{regNo}")
	public void editStudentDetails(@RequestBody Student student, @PathVariable String regNo) {
		studentService.editStudentDetails(student, regNo);
	}
	
	@GetMapping("/findOne/{regNo}")
	public Student findOneId(@PathVariable String regNo) {
		return studentService.findOneId(regNo);
	}
	@GetMapping("/findAll")
	public List<Student> findAllStudentDetails(){
		return studentService.findAllStudentDetails();
	}
	@DeleteMapping("/delete/{regNo}")
	public void deleteStudentDetails(@PathVariable String regNo) {
		
		studentService.deleteStudentDetails(regNo);
		
	}


}
