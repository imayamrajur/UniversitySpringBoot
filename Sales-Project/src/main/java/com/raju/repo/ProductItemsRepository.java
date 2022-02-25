package com.raju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.modul.ProductItems;

public interface ProductItemsRepository extends JpaRepository<ProductItems,Integer> {

}
