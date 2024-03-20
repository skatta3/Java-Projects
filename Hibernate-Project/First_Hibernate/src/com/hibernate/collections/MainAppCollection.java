package com.hibernate.collections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainAppCollection {
	
		public static void main(String[] args) {
			UserDetails user = new UserDetails();
			user.setUserName("Ken Caldwell");
			
			Address addr1 = new Address();
			addr1.setStreet("136 Rosegate Ct");
			addr1.setCity("Columbus");
			addr1.setState("OH");
			addr1.setPincode("43068");
			
			Address addr2 = new Address();
			addr2.setStreet("138 Street No 2");
			addr2.setCity("Hyderabad");
			addr2.setState("TG");
			addr2.setPincode("500007");
			
			user.getListOfAddress().add(addr1);
			user.getListOfAddress().add(addr2);
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(user);
			
			session.getTransaction().commit();
			session.close();
			
		}

}
