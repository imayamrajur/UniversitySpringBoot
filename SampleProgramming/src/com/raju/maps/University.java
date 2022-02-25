package com.raju.maps;

import java.util.Comparator;

public class University implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		
		return o1.getClgId()-o2.getClgId();
	}
	
	
}
