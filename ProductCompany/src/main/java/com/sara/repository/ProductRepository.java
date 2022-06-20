package com.sara.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sara.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value="select * from product where id>=:id",nativeQuery=true)
	public List<Product> getProductSortId(@Param("id") int id);
}
