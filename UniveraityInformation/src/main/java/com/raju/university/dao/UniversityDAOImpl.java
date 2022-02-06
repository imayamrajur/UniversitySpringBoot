package com.raju.university.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.university.model.University;
import com.raju.university.repo.UniversityRepository;

@Repository
public class UniversityDAOImpl implements IUniversityDAO {
	@Autowired
	UniversityRepository universityRepository;

	@Override
	public void addUniversityDetails(University university) {
		universityRepository.saveAndFlush(university);
		System.out.println("Success");
		
	}

	@Override
	public List<University> getUniversityDetails() {
		
		List<University> list = universityRepository.findAll();
		
		return list;
	}

	@Override
	public Optional<University> getUniversityOneId(Integer univId) {
		
		Optional<University> pos = universityRepository.findById(univId);		
		
		return pos;
	}

	@Override
	public void updateUniversityDetails(University university) {
				
		universityRepository.save(university).getUnivId();
	}

	@Override
	public void deleteUniversityDetails(Integer univId) {
		universityRepository.deleteById(univId);
		
	}

}
