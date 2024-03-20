package com.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainAppAnnotations {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();	
	
		
		Employee emp5 = new Employee();
//		emp5.setId(5);
		emp5.setFirstName("Roser ");
		emp5.setLastName("Binny");
		emp5.setUserEmail("roser@gmail.com");
		
		session.save(emp5);  //Persistent State
		
		session.getTransaction().commit();
		session.close();  //Detached State
	}
}

