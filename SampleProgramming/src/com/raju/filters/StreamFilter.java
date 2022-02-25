package com.raju.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sara","Kalainila","Kalaivani","Abithaa","Raju","Vinodhini","Vijayalakshmi","Nithyaa","Bharatha Selvi","Vignesh","Karthik","Vikraman","Sivaranjini","Dhivya","Ranjini","Kabilan");
		//list.forEach(name->System.out.println(name));
		List<String> listName = list.stream().filter(name->name.startsWith("V")).filter(name->name.endsWith("i")).map(name->name.toUpperCase()).collect(Collectors.toList());
		listName.forEach(name->System.out.println(name));
	}

}
