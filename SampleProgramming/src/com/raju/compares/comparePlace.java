package com.raju.compares;

import java.util.Comparator;

import com.raju.maps.College;

public class comparePlace implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		
		return o1.getPlace().compareTo(o2.getPlace());
	}

}
