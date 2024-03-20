package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();	
	
		
//		Employee emp1 = new Employee();
//		emp1.setId(1);
//		emp1.setFirstName("Ken ");
//		emp1.setLastName("Caldwell");
//		
//		Employee emp2 = new Employee();
//		emp2.setId(2);
//		emp2.setFirstName("Mark ");
//		emp2.setLastName("Taylor");
		
//		Employee emp3 = new Employee();
//		emp3.setId(3);
//		emp3.setFirstName("Fred ");
//		emp3.setLastName("Oglosbee");
		
//		session.save(emp1);
//		session.save(emp2);
		
//		session.save(emp3);
		
		Employee emp4 = new Employee();  //Transient State
		emp4.setId(4);
		emp4.setFirstName("Chris ");
		emp4.setLastName("Soyars");
		emp4.setUserEmail("skatta@gmail.com");
		
		session.save(emp4);  //Persistent State
		
		session.getTransaction().commit();
		session.close();  //Detached State
	}

}