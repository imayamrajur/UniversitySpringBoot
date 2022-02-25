package com.raju.parent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.parent.dao.ParentDAO;
import com.raju.parent.modul.Parent;

@Service
public class ParentServiceImpl implements ParentService {

	@Autowired
	ParentDAO parentDAO;
	
	@Override
	public List<Parent> getParentDetails() {
		
		return parentDAO.getParentDetails();
	}

	@Override
	public void addParentDetails(Parent parent) {
		parentDAO.addParentDetails(parent);
		
	}

	@Override
	public Optional<Parent> getOneParentDetails(Integer parentId) {
		
		return parentDAO.getOneParentDetails(parentId);
	}

	@Override
	public void updateParentDetails(Parent parent) {
		parentDAO.updateParentDetails(parent);
		
	}

	@Override
	public void deleteParentDetails(Integer parentId) {
		parentDAO.deleteParentDetails(parentId);
	}

	@Override
	public List<Parent> getLikeMotheName(String motherName) {
		
		return parentDAO.getLikeMotheName(motherName);
	}

	@Override
	public List<Parent> getLikeFatherName(String fatherName) {
		
		return parentDAO.getLikeFatherName(fatherName);
	}

	@Override
	public List<Parent> getLikePlace(String place) {
		
		return parentDAO.getLikePlace(place);
	}
	
	

}
