package com.raju.parent.controller;

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

import com.raju.parent.modul.Parent;
import com.raju.parent.service.ParentService;

@RestController
@RequestMapping("/api/parent")
public class ParentController {
	
	@Autowired
	ParentService parentService;
	
	@GetMapping("/getAll")
	public List<Parent> getParentDetails() {
		return parentService.getParentDetails();
	}
	
	@PostMapping("/add")
	public void addParentDetails(@RequestBody Parent parent) {
		parentService.addParentDetails(parent);
	}
	
	@GetMapping("/findById/{parentId}")
	public Optional<Parent> getOneParentDetails(@PathVariable Integer parentId){
		return parentService.getOneParentDetails(parentId);
	}
	
	@PutMapping("/update")
	public void updateParentDetails(@RequestBody Parent parent) {
		parentService.updateParentDetails(parent);
	}
	
	@DeleteMapping("/delete/{parentId}")
	public void deleteParentDetails(@PathVariable Integer parentId) {
		parentService.deleteParentDetails(parentId);
		
	}
	
	@GetMapping("/mothername/{motherName}")
	public List<Parent> getLikeMother(@PathVariable String motherName){
		return parentService.getLikeMotheName(motherName);
	}
	
	@GetMapping("/fathername/{fatherName}")
	public List<Parent> getLikeFather(@PathVariable String fatherName){
		return parentService.getLikeFatherName(fatherName);
	}
	
	@GetMapping("/place/{place}")
	public List<Parent> getLikePlace(@PathVariable String place){
		return parentService.getLikePlace(place);
	}
	

}
