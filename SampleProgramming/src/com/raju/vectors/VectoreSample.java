package com.raju.vectors;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectoreSample {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<>();
		vc.add("Raju");
		vc.add("Sara");
		vc.add("Prakash");
		System.out.println(vc);
		System.out.println("Extra Add");
		vc.add("Senthil");
		vc.add("Ram");
		vc.add("Raju");
		System.out.println(vc);
		System.out.println("Extra Add index value");
		vc.add(0, "Imayam");
		System.out.println(vc);
		Vector<String> vc1 = new Vector<>();
		System.out.println("New List");
		vc1.add("Tiruvannamalai");
		vc1.add("Chennai");
		System.out.println(vc1);
		vc.addAll(vc1);
		System.out.println("Both List");
		System.out.println(vc);
		
		Iterator its = vc.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
		
		System.out.println("Sort");
		Collections.sort(vc);
		System.out.println(vc);
		System.out.println("Remove index 4");
		vc.remove(4);
		System.out.println(vc);

	}

}
