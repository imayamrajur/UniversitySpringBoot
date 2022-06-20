package com.sara.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name="product")
//@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private int id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String place;
	
	/*
	 * public int getId() { return id; } public String getName() { return name; }
	 * public String getPlace() { return place; } public void setId(int id) {
	 * this.id = id; } public void setName(String name) { this.name = name; } public
	 * void setPlace(String place) { this.place = place; }
	 */
	

}
