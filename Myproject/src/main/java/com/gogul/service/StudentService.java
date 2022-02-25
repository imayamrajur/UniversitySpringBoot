package com.gogul.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gogul.module.Student;

@Service
public class StudentService {
	
	public List<Student> getStudentDetails(){
		List<Student> list = new ArrayList<>();
		Student student1 = new Student(1, "Gogul", "IIT", "MYL");
		Student student2 = new Student(2, "Rahul", "NIT", "Chennai");
		Student student3 = new Student(3, "Sai", "Mahendra", "MYL");
		Student student4 = new Student(4, "Krish", "St.joshep", "Rameshwaram");
		Student student5 = new Student(5, "Rama", "Nehru", "Salem");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		return list;
		
				
	}
}
