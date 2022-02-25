package com.raju.filters;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStram {

	public static void main(String[] args) {
		Stream<Integer> lt = Stream.of(12,43,45,65,24,35,76);
		List<Integer> list=lt.filter(a->a%2==1).collect(Collectors.toList());
		Collections.sort(list);
		list.forEach(a->System.out.println(a));
		
		
	}

}
