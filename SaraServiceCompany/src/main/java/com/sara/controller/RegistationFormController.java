package com.sara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sara.service.RegistaionFormService;

@RestController
@RequestMapping("/sara")
public class RegistationFormController {
	
	@Autowired
	RegistaionFormService registaionFormService;
	
	@PostMapping("/save")
	public String saveRegistationForm(@PathVariable String env) {
		return registaionFormService.saveRegistationForm(env);
	}

}
