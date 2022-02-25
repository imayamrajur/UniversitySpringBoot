package com.raju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.modul.SalesDetails;

public interface SalesRepository extends JpaRepository<SalesDetails, Integer>{

}
