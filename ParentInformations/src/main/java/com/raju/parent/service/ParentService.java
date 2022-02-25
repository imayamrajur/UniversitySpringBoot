package com.raju.parent.service;

import java.util.List;
import java.util.Optional;

import com.raju.parent.modul.Parent;

public interface ParentService {
	
	public List<Parent> getParentDetails();
	public void addParentDetails(Parent parent);
	public Optional<Parent> getOneParentDetails(Integer parentId);
	public void updateParentDetails(Parent parent);
	public void deleteParentDetails(Integer parentId);
	public List<Parent> getLikeMotheName(String motherName);
	public List<Parent> getLikeFatherName(String fatherName);
	public List<Parent> getLikePlace(String place);

}
