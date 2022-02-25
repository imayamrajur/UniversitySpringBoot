package com.raju.parent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.raju.parent.modul.Parent;

public interface ParentRepository extends CrudRepository<Parent, Integer> {
	
	@Query(value = "SELECT p.parent_id, p.father_name, p.mother_name, p.place FROM parent p WHERE p.mother_name LIKE %:motherName%", nativeQuery = true)
	public List<Parent> getLikeMotheName(@Param("motherName") String motherName);
	
	@Query(value = "SELECT p.parent_id, p.father_name, p.mother_name, p.place FROM parent p WHERE father_name LIKE %:fatherName%",nativeQuery = true)
	public List<Parent> getLikeFatherName(@Param("fatherName") String fatherName);
	
	@Query(value = "SELECT p.parent_id, p.father_name, p.mother_name, p.place FROM parent p WHERE place LIKE %:place%", nativeQuery = true)
	public List<Parent> getLikePlace(@Param("place") String place);
	
	@Query(value="SELECT  *FROM parent WHERE place LIKE %?1%",nativeQuery=true)
	public List<Parent> getLikePlaces(String place);

}
