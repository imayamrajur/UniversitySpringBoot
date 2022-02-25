package com.raju.collections;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	List<String> list = null;	
	List<Integer> listInt = null;
	public List<String> getListString(){
		
		list = new ArrayList<>();
		 
		list.add("sunDay");
		list.add("monDay");
		list.add("tuesDay");
		list.add("wednesDay");
		list.add("thursDay");
		list.add("friDay");
		list.add("saturDay");
		
		return list;
		
	}
	
	public List<Integer> getListInteger(){
		listInt = new ArrayList<>();
		listInt.add(43);
		listInt.add(21);
		listInt.add(9);
		listInt.add(71);
		listInt.add(180);
		listInt.add(16);
		listInt.add(81);
		listInt.add(131);
		listInt.add(7);
		listInt.add(120);
		listInt.add(121);
		
		return listInt;
	}

}
