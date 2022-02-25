package com.raju.newjavafeature;

import java.io.IOException;
import java.sql.SQLException;

public class NewInterfaceImpl implements NewInterfaceExtends {

	@Override
	public void desplay(int val) {
		System.out.println("Hi Functional Interface"+val);
		
	}

	@Override
	public void getPlace() {
		// TODO Auto-generated method stub
		
	}
	
	public int add(int a, int b) throws SQLException, IOException {
		int c=0;
		try {
		c=a+b;
		return c;
		}catch(Exception e) {
			e.printStackTrace();
			//return c;
		}finally{
			System.out.println("Finaly Method");
			//return c;
		}
		return c;
		
		
	}
	
	
	
}
