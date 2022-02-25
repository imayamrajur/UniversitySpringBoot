package com.raju.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raju.modul.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
