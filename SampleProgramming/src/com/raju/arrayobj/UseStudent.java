package com.raju.arrayobj;

public class UseStudent {

	public static void main(String[] args) {
		Address perment = new Address("1020", "Pillaiyar koil Street", "Tiruvannamalai", "606705");
		Address commu = new Address("117", "Elim Nagar", "Perungudi", "600096");
		Address[] ad = { perment, commu };
		Student student = new Student(10001, "Raju", "Computer Science", ad);

		System.out.println("Object");
		System.out.println(student);
		System.out.println("Array");
		System.out.println(student.getAddress()[0]);
		System.out.println(student.getAddress()[1]);
	}

}
