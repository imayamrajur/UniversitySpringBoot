package com.raju.maps;

import java.util.Comparator;

public class CompareName implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		
		//return o1.getClgName().hashCode()-o2.getClgName().hashCode();
		return o1.getClgName().compareTo(o2.getClgName());
	}

}
