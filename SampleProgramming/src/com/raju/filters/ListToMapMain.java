package com.raju.filters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.raju.listtomap.Employee;

public class ListToMapMain {

	public static void main(String[] args) throws Exception {
		ArrayList<Employee> list = new ArrayList<>();
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Raju");
		emp.setEmpDest("Engineer");
		emp.setSalary(20000);
		Employee em = new Employee();
		em.setEmpId(102);
		em.setEmpName("Imayam");
		em.setEmpDest("Soft");
		em.setSalary(25000);
		
		list.add(emp);
		list.add(em);
		
		for(Employee e : list) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpDest());
			System.out.println(e.getSalary());
			System.out.println("-----------------");
		}
		
		Map<Integer,String> map = list.stream().collect(Collectors.toMap(Employee::getEmpId, 
				Employee::getEmpName));
		System.out.println(map);
		
		Map<Integer,Employee> mp = new HashMap<Integer, Employee>();
		for(Employee s:list) {			
			mp.put(s.getEmpId(), s);			
		}		
		mp.forEach((k,v)->System.out.println(k+ "-"+v.getEmpId()+"  "
		+v.getEmpName()+"  "+v.getEmpDest()+"  "+v.getSalary()));	
		
		
		System.out.println("**********");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		System.out.println("*****______*****");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		System.out.println("=====================");
		List<Integer> lists = mp.keySet().stream().collect(Collectors.toList());
		List<Employee> listsv = mp.values().stream().collect(Collectors.toList());
		
		List<Integer> li = new ArrayList<Integer>(mp.keySet());
		List<Employee> lit = new ArrayList<Employee>(mp.values());
		
		
		
		for(Employee es : lit) {
			System.out.println(es.getEmpId()+" "+es.getEmpName()+"  "
		+es.getEmpDest()+"  "+es.getSalary());
		}
		
		System.out.println("_____****_____");
		
		Set<Employee> st = new HashSet<Employee>(lit);
		
		for(Employee es : st) {
			System.out.println(es.getEmpId()+" "+es.getEmpName()+"  "
		+es.getEmpDest()+"  "+es.getSalary());
		}
		
		System.out.println("&&&&&&**********&&&&&&");
		List<Employee> lt = new ArrayList<Employee>(st);
		
		for(Employee es : lt) {
			System.out.println(es.getEmpId()+" "+es.getEmpName()+"  "
		+es.getEmpDest()+"  "+es.getSalary());
		}
	}

}
