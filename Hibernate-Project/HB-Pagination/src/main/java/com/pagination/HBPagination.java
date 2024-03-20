package com.pagination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBPagination {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from UserDetails");
		query.setFirstResult(4);
		query.setMaxResults(4);
		
		List<UserDetails> users = (List<UserDetails>) query.list();
		
		session.getTransaction().commit();
		session.close();
		
		for(UserDetails u :  users)
			System.out.println(u.getUserID() + "    " + u.getUserName());
	}
}
