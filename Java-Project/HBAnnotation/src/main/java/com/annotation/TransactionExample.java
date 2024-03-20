package com.annotation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TransactionExample {
   static SessionFactory factory; 
   static Session session;
   
   public static void main(String[] args) {
	   
      try {    	  
  		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	
		factory = meta.getSessionFactoryBuilder().build();
		
	   session = factory.openSession();

	    session.beginTransaction();
	         Employee employee = new Employee();
	         employee.setFirstName("Krishi");
	         employee.setLastName("Patel");
	         employee.setSalary(10000);
	     
	         
	         Employee employee1 = new Employee();
	         employee1.setFirstName("HibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernateHibernate");
	         employee1.setLastName("Patel");
	         employee1.setSalary(12000);
	         
	     
	         System.out.println("Saved Employee1");
	         session.save(employee); 
	         session.save(employee1); 
	         System.out.println("Saved Employee2");
	         
	         
	         session.getTransaction().commit();;

      } catch (HibernateException ex) { 
    	  System.out.println("In Exception Block");
          	  session.getTransaction().rollback();

          ex.printStackTrace(); 
      }
      
   
   }
 
}
