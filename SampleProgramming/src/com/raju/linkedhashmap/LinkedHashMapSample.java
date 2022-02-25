package com.raju.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("R", "Raju");
		lhm.put("S", "Sara");
		lhm.put("P", "Prakash");
		lhm.put("T", "Theerun");
		lhm.put("V", "Saanvi");
		lhm.put("A", "Prabha");
		lhm.put("SS", "Theerun");
		
		System.out.println(lhm);
		
		for(Entry<String, String> s:lhm.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		

	}

}
