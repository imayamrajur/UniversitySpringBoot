package com.raju.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.raju.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addStudentDetails(Student student) {
		
		jdbcTemplate.update("INSERT INTO student (studentRegNo, studentName, studentFName, studentDOB, "
				+ "studentGender, studentDept, studentBranch, studentMailId, studentContactNo, "
				+ "studentAddress) VALUES (?,?,?,?,?,?,?,?,?,?)",
				student.getStudentRegNo(),student.getStudentName(),student.getStudentFName(),
				student.getStudentDOB(),student.getStudentGender(),student.getStudentDept(),
				student.getStudentBranch(),student.getStudentMailId(),student.getStudentContactNo(),
				student.getStudentAddress());
				
	        System.out.println("Student Added!!");
	        
		
	}

	@Override
	public void editStudentDetails(Student student, String regNo) {
		
		jdbcTemplate.update("UPDATE student SET studentName = ? , studentFName = ? , "
				+ "studentDOB = ? , studentGender = ? , studentDept = ? , studentBranch = ? , "
				+ "studentMailId = ? , studentContactNo = ? , studentAddress = ? WHERE studentRegNo = ?",
				student.getStudentName(),student.getStudentFName(),student.getStudentDOB(),
				student.getStudentGender(),student.getStudentDept(),student.getStudentBranch(),
				student.getStudentMailId(),student.getStudentContactNo(),student.getStudentAddress(), regNo);
		
		        System.out.println("Student Updated!!");
	}

	@Override
	public void deleteStudentDetails(String regNo) {
		
		jdbcTemplate.update("DELETE from student WHERE studentRegNo = ?", regNo);
		
		 System.out.println("Student Deleted!");
		
	}

	@Override
	public Student findOneId(String regNo) {
		
		Student student = (Student) jdbcTemplate.queryForObject("SELECT * FROM student WHERE studentRegNo = ? ", new Object[] {regNo}, new BeanPropertyRowMapper(Student.class));
		
		return student;
	}

	@Override
	public List<Student> findAllStudentDetails() {
		
		List<Student> studentList = jdbcTemplate.query("SELECT * FROM student", new BeanPropertyRowMapper(Student.class));
				
		return studentList;
	}

}
