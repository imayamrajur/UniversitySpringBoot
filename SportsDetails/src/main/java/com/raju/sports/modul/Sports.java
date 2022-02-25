package com.raju.sports.modul;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sports {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer sportId;
	private String sportName;
	private String sportType;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSportId() {
		return sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public String getSportType() {
		return sportType;
	}

	public void setSportId(Integer sportId) {
		this.sportId = sportId;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

}
