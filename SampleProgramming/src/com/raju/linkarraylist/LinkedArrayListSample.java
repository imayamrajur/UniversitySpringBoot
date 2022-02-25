package com.raju.linkarraylist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedArrayListSample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list);
		System.out.println("Add Extra value");
		list.add(400);
		list.add(500);
		System.out.println(list);
		System.out.println("Add First");
		list.addFirst(1000);
		System.out.println(list);
		System.out.println("Add Last");
		list.addLast(10);
		System.out.println(list);
		System.out.println("Remove index 1");
		list.remove(1);
		System.out.println(list);
		LinkedList<Integer> lst = new LinkedList<>();
		System.out.println("New List");
		lst.add(3001);
		lst.add(5001);
		
		System.out.println(lst);
		System.out.println("join List 1 and 2");
		list.addAll(lst);
		
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(111);
		list.add(222);
		list.add(333);
		System.out.println("Iterator value");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Sort List");
		Collections.sort(list);
		System.out.println(list);
		

	}

}
