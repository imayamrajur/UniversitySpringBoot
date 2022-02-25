package com.raju.sports.controller;


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

import com.raju.sports.modul.Sports;
import com.raju.sports.service.SportsService;

@RestController
@RequestMapping("/sports")
public class SportsController {
	
	@Autowired
	SportsService sportsService;
	
	@PostMapping("/add")
	public void addSportsDetails(@RequestBody Sports sports) {
		sportsService.addSportsDetails(sports);
	}
	@GetMapping("/getAll")
	public List<Sports> getSportsDetails(){
		
		return sportsService.getSportsDetails();
	}
	@GetMapping("/getById/{sportId}")
	public Sports getOneSportsDetail(@PathVariable Integer sportId) {
		return sportsService.getOneSportsDetail(sportId);
	}
	
	@PutMapping("/update/{sportId}")
	public void updateSportDetail(@RequestBody Sports sports, @PathVariable Integer sportId) {
		sportsService.updateSportDetail(sports, sportId);
		
	}
	
	@DeleteMapping("/delete/{sportId}")
	public void deleteSportDetails(@PathVariable Integer sportId) {
		sportsService.deleteSportDetails(sportId);
	}

}
