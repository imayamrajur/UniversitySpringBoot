package com.raju.seriazables;

import java.io.Serializable;

public class Employee implements Serializable {
	public int empId;
	public String empName;
	public transient int salary;

}
