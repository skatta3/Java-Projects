package com.java.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest {
	
	public static void main(String[] args) {
		String fileName="employee.txt";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);
		emp.setPassword("abcde");
		
		//serialize to file
//		try {
//			FileOutputStream fos = new FileOutputStream(fileName);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(emp);
//
//			fos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//			return;
//		}
//		
		// Deserialization
		Employee empNew = null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			empNew = (Employee) ois.readObject();
			ois.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	}
}
