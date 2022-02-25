package com.raju.seriazables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {

	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		e.empId=1001;
		e.empName="Raju";
		e.salary=100000;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("F:/javasample/sararaju.io");
			ObjectOutputStream output = new ObjectOutputStream(fileOut);
			output.writeObject(e);
			output.close();
			fileOut.close();
			System.out.println("Success Serializable  :"+e.salary);
			
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		Employee s = null;
		FileInputStream fileIn = new FileInputStream("F:/javasample/sararaju.io");
		ObjectInputStream obj = new ObjectInputStream(fileIn);
		try {
			s= (Employee) obj.readObject();
		} catch (ClassNotFoundException | IOException e1) {
			
			e1.printStackTrace();
		}
		
		System.out.println("Deserialization");		
		System.out.println(s.empId);
		System.out.println(s.empName);
		System.out.println(s.salary);

	}

}
