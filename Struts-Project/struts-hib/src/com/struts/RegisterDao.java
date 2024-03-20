package com.struts;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterDao {

	public static int saveUser(User u){
		System.out.println("In Register Dao saveuser method");
		
		int i = 0;
		try {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		System.out.println("Session opened");
		Transaction t=session.beginTransaction();
		System.out.println("Transaction Begin");
		i=(Integer)session.save(u);
		t.commit();
		session.close();
		System.out.println("Data Saved");
		
		} catch(Exception e) {
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		return i;
	}
}
