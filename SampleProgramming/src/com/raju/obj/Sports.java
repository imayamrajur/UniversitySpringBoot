package com.raju.obj;

public class Sports {
	private int id;
	private String sportsName;
	
	public Sports(int id, String sportsName) {
		
		this.id = id;
		this.sportsName = sportsName;
	}
	public int getId() {
		return id;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	@Override
	public String toString() {
		return "Sports [id=" + id + ", sportsName=" + sportsName + "]";
	}
	
	
	
	

}
