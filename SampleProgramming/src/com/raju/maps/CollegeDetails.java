package com.raju.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.raju.compares.comparePlace;

public class CollegeDetails {

	public static void main(String[] args) {
		College clgAnn = new College(1001, "Anna Universit", "Guindy");
		College clgAml = new College(1005, "Annamalai Universit", "Chidambaram");
		College clgVel = new College(1007, "Vels Universit", "Chrompet");
		College clgSrm = new College(1003, "SRM Universit", "Potheri");
		College clgTvl = new College(1002, "Thiruvalluvar Universit", "Vellor");
		College clgBrt = new College(1010, "Bharathi Dhasan Universit", "Tanjor");
		
		List<College> clist = new ArrayList<>();
		clist.add(clgVel);
		clist.add(clgBrt);
		clist.add(clgTvl);
		clist.add(clgSrm);
		clist.add(clgAml);
		clist.add(clgAnn);
		
		//Map
		Map<Integer,College> map = new HashMap<Integer, College>();
		map.put(101, clgAnn);
		map.put(102, clgAml);
		map.put(105, clgVel);
		map.put(106, clgSrm);
		map.put(103, clgTvl);
		map.put(104, clgBrt);
		
		map.forEach((r,s)->System.out.println(r+" "+s));
		
		System.out.println("------List Values-------");
		
		List<College> cls = map.values().stream().collect(Collectors.toList());
		cls.forEach(a->System.out.println(a));
		
		List<College> list = cls.stream().filter(name->name.getClgName()!=null).collect(Collectors.toList());
		list.forEach(name->System.out.println(name.getClgName()));
		
		List<String> clsNameList = new ArrayList<String>();
		for(College clgs : list) {
			clsNameList.add(clgs.getClgName());
			System.out.println(clgs.getClgName());			
		}
		System.out.println("-------------Sorted---------------");
		List<String> ordList = clsNameList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		ordList.forEach(name->System.out.println(name));
		System.out.println("-------Filter--------");
		
		Stream<Integer> st = Stream.of(5,3,7,9,45,98,101,92,89);
		List<Integer> s = st.filter(r->r%2==1).collect(Collectors.toList());
				
		for(int r:s) {
			System.out.println(r);
		}
		System.out.println("-----CompareTo------");
		List<College> cp = new ArrayList<College>();
		cp.add(clgVel);
		cp.add(clgTvl);
		cp.add(clgSrm);
		cp.add(clgAnn);
		cp.add(clgBrt);
		cp.add(clgAml);
		Collections.sort(cp);
		for(College ss: cp) {
			System.out.println(ss);
		}
		
		System.out.println("----Compare------");
		List<College> utList = new ArrayList<College>();
		utList.add(clgVel);
		utList.add(clgTvl);
		utList.add(clgSrm);
		utList.add(clgAnn);
		utList.add(clgBrt);
		utList.add(clgAml);
		
		
		Collections.sort(utList,new University());
		for(College cg:utList) {
			System.out.println(cg);
		}
		System.out.println("----Compare by Name ------");
		Collections.sort(utList, new CompareName());
		for(College cgs:utList) {
			System.out.println(cgs);
		}
		
		
		System.out.println("++++++Compare Name++++++");
		//Collections.sort(clist);
		Collections.sort(clist, new comparePlace());
		for(College c:clist) {
			
			System.out.println(c.getClgId()+" "+c.getClgName()+" "+c.getPlace());
		}
		
		Map<Integer,String> rMap = clist.stream().collect(Collectors.toMap(College::getClgId, College::getClgName));
		rMap.forEach((k,v)->System.out.println(k+"---"+v));
		
		
	}

}
