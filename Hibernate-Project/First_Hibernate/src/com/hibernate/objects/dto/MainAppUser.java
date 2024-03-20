package com.hibernate.objects.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainAppUser {
	
		public static void main(String[] args) {
			UserDetails user = new UserDetails();
			user.setUserName("Ken Caldwell");
			
			Address addr = new Address();
			addr.setStreet("136 Rosegate Ct");
			addr.setCity("Columbus");
			addr.setState("OH");
			addr.setPincode("43068");
			
			user.setAddress(addr);
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(user);
			
			session.getTransaction().commit();
			session.close();
			
		}

}
