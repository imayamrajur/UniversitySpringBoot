package com.raju.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.modul.Employee;
import com.raju.modul.FileResume;
import com.raju.repo.EmployeeRepository;
import com.raju.repo.FileResumeRepository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	FileResumeRepository fileResumeRepository;
	
		
	public List<Employee> getAllEmployeeList(){
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList;
	}
	
	public void addEmployeeDetails(Employee employee) {
		
		FileResume fileResume = new FileResume(employee.getFileResume().getId(), employee.getFileResume().getFileName(), employee.getFileResume().getFileType(), employee.getFileResume().getFileData());
		fileResumeRepository.save(fileResume);
		employeeRepository.save(employee);		
		
	}

	@Override
	public Optional<Employee> findOneEmployee(Integer empId) {
		Optional<Employee> findOne = employeeRepository.findById(empId);
		return findOne;
	}

	@Override
	public void updateEmployee(Employee employee, Integer empId) {
		employeeRepository.save(employee).getEmpId();
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
		
	}
	
}
