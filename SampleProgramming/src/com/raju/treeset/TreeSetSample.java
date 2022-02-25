package com.raju.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		TreeSet<Integer> tst = new TreeSet<>();
		ts.add(45);
		ts.add(20);
		ts.add(5);
		ts.add(15);
		System.out.println(ts);
		System.out.println("Extra add with duplicate 20,5");
		ts.add(3);
		ts.add(60);
		ts.add(50);
		ts.add(20);
		ts.add(5);
		System.out.println(ts);
		System.out.println("New List");
		tst.add(100);
		tst.add(35);
		tst.add(20);
		System.out.println(tst);
		System.out.println("Both Join");
		ts.addAll(tst);
		System.out.println(ts);
		System.out.println("Delete value 3");
		ts.remove(3);
		System.out.println(ts);
		
		System.out.println("Iterator value");
		Iterator<Integer> its = ts.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		System.out.println("Descending Order");
		Iterator<Integer> ds = ts.descendingIterator();	
		while(ds.hasNext()) {
			System.out.println(ds.next());
		}
		
		System.out.println("String Data");
		
		TreeSet<String> ss = new TreeSet<>();
		ss.add("Sbra");
		ss.add("Rara");
		ss.add("Aara");
		ss.add("Sara");
		ss.add("Zara");
		ss.add("sara");
		ss.add("ZZta");
		ss.add("Zcta");
		ss.add("KaTa");
		ss.add("Mcra");
		ss.add("MAcra");
		ss.add("mAcra");
		ss.add("TmAcra");
		ss.add("tacra");
		ss.add("tAcra");
		ss.add("macra");
		ss.add("mbacra");
		ss.add("maacra");
		ss.add("Zara");
		
		System.out.println(ss);
		Iterator<String> s = ss.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}

	}

}
