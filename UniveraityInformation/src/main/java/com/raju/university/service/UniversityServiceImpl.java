package com.raju.university.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.university.dao.IUniversityDAO;
import com.raju.university.model.University;

@Service
public class UniversityServiceImpl implements IUniversityService {
	@Autowired
	IUniversityDAO iuniversityDAo;

	@Override
	public void addUniversityDetails(University university) {
		iuniversityDAo.addUniversityDetails(university);
		
	}

	@Override
	public List<University> getUniversityDetails() {
		
		return iuniversityDAo.getUniversityDetails();
	}

	@Override
	public Optional<University> getUniversityOneId(Integer univId) {
		
		return iuniversityDAo.getUniversityOneId(univId);
	}

	@Override
	public void updateUniversityDetails(University university) {
		iuniversityDAo.updateUniversityDetails(university);
		
	}

	@Override
	public void deleteUniversityDetails(Integer univId) {
		iuniversityDAo.deleteUniversityDetails(univId);
		
	}

}
