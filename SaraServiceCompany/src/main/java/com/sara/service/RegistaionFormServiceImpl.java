package com.sara.service;

import org.springframework.stereotype.Service;

@Service
public class RegistaionFormServiceImpl implements RegistaionFormService {

	@Override
	public String saveRegistationForm(String env) {
		if(env.equalsIgnoreCase("prod")) {
			
		}else {
			
		}
		return null;
	}

}
