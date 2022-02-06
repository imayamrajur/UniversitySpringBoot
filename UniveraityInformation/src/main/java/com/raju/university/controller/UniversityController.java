package com.raju.university.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.university.model.University;
import com.raju.university.service.IUniversityService;

@RestController
@RequestMapping("/university")
public class UniversityController {
	@Autowired
	IUniversityService iuniversity;
	
	@PostMapping("/save")
	public void addUniversityDetails(@RequestBody University university) {
		iuniversity.addUniversityDetails(university);
		
	}
	@GetMapping("/getAll")
	public List<University> getUniversityDetails(){
		return iuniversity.getUniversityDetails();
		
	}
	@GetMapping("/getOneId/{univId}")
	public Optional<University> getUniversityOneId(@PathVariable Integer univId){
		return iuniversity.getUniversityOneId(univId);
		
	}
	@PutMapping("/update")
	public void updateUniversityDetails(@RequestBody University university){
		 
		 iuniversity.updateUniversityDetails(university);
		
	}
	@DeleteMapping("/delete/{univId}")
	public void deleteUniversityDetails(@PathVariable Integer univId) {
		iuniversity.deleteUniversityDetails(univId);
	}

}
