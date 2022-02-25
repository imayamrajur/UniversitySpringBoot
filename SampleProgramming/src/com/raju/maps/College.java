package com.raju.maps;

public class College implements Comparable<College> {
	private int clgId;
	private String clgName;
	private String place;
	
	
	public College(int clgId, String clgName, String place) {
		
		this.clgId = clgId;
		this.clgName = clgName;
		this.place = place;
	}
	public int getClgId() {
		return clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public String getPlace() {
		return place;
	}

	
	 @Override 
	 public String toString() { 
		 return "College [clgId=" + clgId +", clgName=" + clgName + ", place=" + place + "]"; 
		 }
	 
	@Override
	public int compareTo(College o) {
		
		return this.clgId-o.clgId;
	}
	
	
	

}
