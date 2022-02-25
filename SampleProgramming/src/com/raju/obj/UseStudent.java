package com.raju.obj;

public class UseStudent {

	public static void main(String[] args) {
		Address address = new Address(102, "Vinayagar Street");
		Sports sports1 = new Sports(201, "Cricket");
		//Sports sports2 = new Sports(202, "Kabaddi");
		
		Students student = new Students(1001, "Raju", address,sports1) ;
		
		System.out.println("Student Id :"+student.getId());
		System.out.println("Student Name :"+student.getName());
		System.out.println("Door No :"+student.getAddress().getDoNo());
		System.out.println("Street Name :"+student.getAddress().getStreet());
		System.out.println("Game Id: "+student.getSportsList().getId());
		System.out.println("Game Name :"+student.getSportsList().getSportsName());
		
		System.out.println(student);
		
		int a =120;
		while(a>0) {
			int n = a/2;
			a=n;
			System.out.print("\t"+n);
			
		}
		System.out.println("");
		int n=30;
		do {
			int at = n/2;
			System.out.print("\t"+at);
			n=at;
		}while(n>0);
		System.out.println("");
		int as =0;
		while(as<30) {
			
			System.out.print("\t"+as);
			as++;			
			
		}
		System.out.println("");
		int i=1;
		do {
			System.out.print("\t"+i);
			i++;
		}while(i<10);
		
		System.out.println("");
		
		int val = 10;
		Integer va = new Integer(10);
		System.out.println(val==va.hashCode());
		System.out.println(val);
		System.out.println(va.hashCode());

	}
	
	

}
