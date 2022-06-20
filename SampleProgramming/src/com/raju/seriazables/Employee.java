package com.raju.seriazables;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8331825003648548377L;
	public int empId;
	public String empName;
	public transient int salary;

}
