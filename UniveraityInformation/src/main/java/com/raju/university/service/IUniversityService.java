package com.raju.university.service;

import java.util.List;
import java.util.Optional;

import com.raju.university.model.University;

public interface IUniversityService {
	
	public void addUniversityDetails(University university);
	public List<University> getUniversityDetails();
	public Optional<University> getUniversityOneId(Integer univId);
	public void updateUniversityDetails(University university);
	public void deleteUniversityDetails(Integer univId);

}
