package com.raju.university.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.university.model.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {

}
