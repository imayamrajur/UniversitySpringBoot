package com.raju.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Sara");
		hm.put(2, "Raju");
		hm.put(5, "imayam");
		hm.put(3, "Sudha");
		hm.put(8, "TVM");
		hm.put(4, "Shen");
		hm.put(2, "Raju");
		hm.put(7, "Raju");
		hm.put(6, "Sara");
		System.out.println("Result value");
		System.out.println(hm);
		
		System.out.println("Remove value");
		hm.remove(8);
		System.out.println(hm);
		
		System.out.println("Absent value");
		hm.putIfAbsent(4, "Shen");
		System.out.println(hm);
		
		System.out.println("Update value");
		hm.replace(4, "Shenba");
		System.out.println(hm);
		
		System.out.println("Update value");
		hm.replace(3, "Sudha","Sudha Sara");
		System.out.println(hm);
		
		System.out.println("Iteration value");
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("For Each Lambda");
		
		hm.forEach((k,v)-> System.out.println(k+ " "+v));

	}

}
