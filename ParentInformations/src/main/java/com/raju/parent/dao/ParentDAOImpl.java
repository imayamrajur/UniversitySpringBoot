package com.raju.parent.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.parent.modul.Parent;
import com.raju.parent.repository.ParentRepository;

@Repository
public class ParentDAOImpl implements ParentDAO {
	
	@Autowired
	ParentRepository parentRepository;

	@Override
	public List<Parent> getParentDetails() {
		Iterable<Parent> parent = parentRepository.findAll();
		return (List<Parent>) parent;
	}

	@Override
	public void addParentDetails(Parent parent) {
		parentRepository.save(parent);
		
	}

	@Override
	public Optional<Parent> getOneParentDetails(Integer parentId) {
		
		Optional<Parent> parant = parentRepository.findById(parentId);
		
		return parant;
	}

	@Override
	public void updateParentDetails(Parent parent) {
		parentRepository.save(parent).getParentId();
		
	}

	@Override
	public void deleteParentDetails(Integer parentId) {
		
		parentRepository.deleteById(parentId);
	}

	@Override
	public List<Parent> getLikeMotheName(String motherName) {
		Iterable<Parent> parent = parentRepository.getLikeMotheName(motherName);
		return (List<Parent>) parent;
	}

	@Override
	public List<Parent> getLikeFatherName(String fatherName) {
		Iterable<Parent> parent = parentRepository.getLikeFatherName(fatherName);
		return (List<Parent>) parent;
	}

	@Override
	public List<Parent> getLikePlace(String place) {
		Iterable<Parent> parent = parentRepository.getLikePlace(place);
		return (List<Parent>) parent;
	}
	
	

}
