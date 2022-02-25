package com.raju.sethashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);
		System.out.println("Add Extra with 20,30,40 Again ");
		hs.add(50);
		hs.add(30);
		hs.add(20);
		hs.add(60);
		hs.add(40);
		System.out.println(hs);
		System.out.println("Remove value 50");
		hs.remove(50);
		System.out.println(hs);
		
		System.out.println("Iterator While Loop");
		Iterator its = hs.iterator();		
		while(its.hasNext()){
			System.out.println(its.next());
		}
		System.out.println("Iterator for Loop");
		for(Integer a : hs) {
			System.out.println(a);
		}
		
		System.out.println("Expression");
		hs.forEach(r->System.out.println(r));
		
		
	}

}
