package com.raju.conparators;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorMain {
	
	int r=10;
	int s=20;

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(101, "Raju", "Tiruvannamalai",10000);
		Employee e2 = new Employee(102, "Ratha", "Chennai",20000);
		Employee e3 = new Employee(103, "Sara", "Madurai",30000);
		Employee e4 = new Employee(104, "Saanvi", "Polur",40000);
		Employee e5 = new Employee(105, "Theerun", "Coimbathur",50000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//Stream<Employee> salary = list.stream().filter((e) ->e.getSalary()>20000).forEach(e->System.out.println(e));
		
		List<Employee> saList = list.stream().filter(e->e.getSalary()>=20000 && e.getSalary()<=40000).filter(e->e.getPlace().contains("a")).collect(Collectors.toList());
		//saList.forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getPlace()+" "+e.getSalary()));
		saList.forEach(e->System.out.println(e));
		System.out.println(e1.getName());
		ComparatorMain rr = new ComparatorMain();
		rr.display();	
		List<Integer> listInt = list.stream().map(Employee::getSalary).collect(Collectors.toList());
		
		listInt.forEach(a->System.out.println(a));
		int sr = listInt.stream().reduce(0,(a,b)->a+b);
		System.out.println(sr);
		
	}
	
	static {
		System.out.println("ShivaRanjini");
	}
	
	public void display() {
		System.out.println(r+s);
		
	}
	

}
