package com.raju.lms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {

	public static void main(String[] args) {
 		List<String> list = new ArrayList<>();
		//String days = "Sunday,Monday,Tuesday";
		String days =  args[0];
		String[] day = days.split(",");
		list = Arrays.asList(day);
		
		
		for(String s : list) {
			System.out.print("\t"+s.toUpperCase());
		}
		
		for(int i=0;i<day.length;i++) {
			
			System.out.println(day[i]);
		}
		
		
		
		
	}

}
