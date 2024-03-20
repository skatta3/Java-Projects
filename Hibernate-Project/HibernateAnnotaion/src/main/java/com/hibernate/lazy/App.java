package com.hibernate.lazy;

	import java.util.HashSet;
	 import java.util.Set;
	 import org.hibernate.Session;
	 import org.hibernate.SessionFactory;
	 import org.hibernate.Transaction;
	 import org.hibernate.cfg.Configuration;
	 public class App 
	 {
	     public static void main( String[] args )
	     {
	        Configuration cfg= new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session= factory.openSession();
	        Categories cate1 = new Categories();
	        cate1.setCate_id(01);
	        cate1.setCate_name("category 01");
	        Categories cate2 = new Categories();
	        cate2.setCate_id(02);
	        cate2.setCate_name("category 02");
	        Items i= new Items();
	        i.setItem_id(31);
	        i.setItem_name("item 11");
	        Items i2 =new Items();
	        i2.setItem_id(32);
	        i2.setItem_name("item 21");
	        Set set= new HashSet();
	        set.add(i);
	        set.add(i2);
	        cate1.setItems(set);
	        cate2.setItems(set);
	        Transaction t= session.beginTransaction();
	        session.save(cate1);
	        session.save(cate2);
	        t.commit();
	        System.out.println("saved successfully!!!!");
	        session.close();
	     }
	 } 