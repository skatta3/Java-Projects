package com.training.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main( String[] args )
    {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();  //Equivalent to Connection
		
		Transaction t = session.beginTransaction();
		
//		 Employee e1=new Employee();  
//		    e1.setId(1);  
//		    e1.setFirstName("Chris");  
//		    e1.setLastName("Soyars");  
//		    
//		 Employee e2=new Employee();  
//		    e2.setId(2);  
//		    e2.setFirstName("Ken");  
//		    e2.setLastName("Caldwell");  
//       
//       session.save(e1);
//       session.save(e2);
		
		 Employee e3=new Employee();  
		    e3.setId(7);  
		    e3.setFirstName("Clayton");  
		    e3.setLastName("Jobes");  
		    e3.setSalary(1000.00f);
		    
		 Employee e4=new Employee();  
			 e4.setId(8);  
			 e4.setFirstName("Mark");  
			 e4.setLastName("Taylor");  
			 e4.setSalary(1100.00f);
			 
			 
			 session.save(e3);
			 session.save(e4);
       
	   t.commit();
       System.out.println("successfully saved");  
//		factory.close();
       session.close();   
  
        // Get the Data
        Employee emp = null;
        session = factory.openSession();  //Equivalent to Connection
		
		session.beginTransaction();
		emp = (Employee)session.get(Employee.class, 1);
		System.out.println("Employee information retrieved: " + emp.getFirstName());
        session.close();   
    	factory.close();
    }
}
