package com.raju.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(4, "Tamilnadu");
		tm.put(3, "Andira");
		tm.put(2, "Kerala");
		tm.put(1, "Tamilnadu");			
		System.out.println(tm);
		tm.put(5, "Telungana");
		tm.put(6, "Maharastra");
		System.out.println(tm);
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(7, "Karnadaka");
		t.put(8, "Kolkatha");
		System.out.println(t);
		System.out.println("Join List");
		tm.putAll(t);
		System.out.println(tm);
		
		for(Map.Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}	
			

	}

}
