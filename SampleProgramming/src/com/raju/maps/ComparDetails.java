package com.raju.maps;

public class ComparDetails implements Comparable<College> {
	College college;
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public int compareTo(College o) {
		
		return college.getClgId()-o.getClgId();
	}

}
