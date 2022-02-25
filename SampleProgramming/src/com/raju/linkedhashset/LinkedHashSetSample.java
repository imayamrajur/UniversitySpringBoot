package com.raju.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		LinkedHashSet<String> lst = new LinkedHashSet<>();
		ls.add("Chennai");
		ls.add("Madurai");
		ls.add("Salem");
		ls.add("TVM");		
		System.out.println(ls);
		System.out.println("Add Extra with Duplocate Value");
		ls.add("Madurai");
		ls.add("Salem");
		ls.add("Vellor");
		ls.add("TVM");
		System.out.println(ls);
		System.out.println("Remove use value");
		ls.remove("Madurai");
		System.out.println(ls);
		
		System.out.println("New List");
		lst.add("Tiruppur");
		lst.add("Erode");
		lst.add("TVM");
		System.out.println(lst);
		System.out.println("Join Both List at one");
		ls.addAll(lst);
		System.out.println(ls);
		
		System.out.println("Iterator value");
		
		Iterator<String> its = ls.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
	}

}
