package com.raju.arraylist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.raju.maps.College;

public class ArrayListSample {
	enum susi{
		RAJU,SARA;
	}
	public static void main(String aregs[]) throws NumberFormatException,IllegalStateException,ArrayIndexOutOfBoundsException, ArithmeticException {
		
		ArrayList<String> list = new ArrayList<String>();		
		list.add("java");
		list.add("C++");
		list.add("C program");
		list.add("MySql");
		System.out.println(" List ="+list);
		list.add("Python");
		list.add("Spring MVC");
		System.out.println("Extra Add ="+list);
		list.add("Spring Framework");
		list.add("Hibern`ate");
		list.remove(1);
		System.out.println("Remove use index 1");
		System.out.println(list);
		System.out.println("Remove useing Value Python ");
		list.remove("Python");		
		System.out.println(list);		
		System.out.println("Add Useing Index 1 and value");
		list.add(1,"MongoDB");
		System.out.println(list);
		list.add("MySql");	
		System.out.println("Iterator value :");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		/*
		 * System.out.println("________Exception_________"); int ac=10/0;
		 * System.out.println(ac);
		 */
		
		/*
		 * try { System.out.println("________Exception_________"); int ac=10/0;
		 * System.out.println(ac); }catch(ArithmeticException e){ e.printStackTrace(); }
		 */		
		
		System.out.println("________Exception_________");
		
		System.out.println("For Each Lambda");
		
		list.forEach((a)->System.out.println(a));
		
		System.out.println("Stream Filter");
		
		list.stream().filter(r->r.startsWith("S")).forEach(System.out::println);
		
		AbstractList<String> alist = new ArrayList<>(); 
		
		System.out.println("_____________AbstractList_______________");
		
		alist.add("Raju");
		alist.add("Arun");
		alist.add("Sara");
		alist.add("Rasa");
		
		for(String s : alist) {
			System.out.println(s);
		}
		
		var rrr = "Raju Sara";
		System.out.println(rrr);
		
		System.out.println("Enter Text :");		
		Scanner st = new Scanner(System.in);
		String rs = st.next();
		boolean result = switch(susi.SARA) {
		case RAJU -> true;
		case SARA -> false;
		default -> throw new IllegalArgumentException("Wrong");
		};
		
		System.out.println(result);
		
		
		
		System.out.println("--------------------List--------------");
		College col = new College(1001, "Anna University", "Chennai");
		ArrayList<Object> listR = new ArrayList<>();
		listR.add("Raju");
		listR.add(20);
		listR.add("Sara");
		listR.add(80);
		listR.add(col);

		for (int numer = 0; numer < listR.size(); numer++) {
			System.out.println(listR.get(numer));
		}

		System.out.println("--------------------List Object toString()--------------");

		for (Object o : listR) {
			System.out.println(o.toString());
		}

		System.out.println("--------------------List Object--------------");

		for (Object o : listR) {
			System.out.println(o);
		}
		
		System.out.println("--------------------List Object--------------");

		for (Object o : listR) {
			System.out.println(o);
		}

		
	}	
	
}


