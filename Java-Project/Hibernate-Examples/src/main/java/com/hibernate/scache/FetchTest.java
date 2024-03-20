package com.hibernate.scache;  
  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
  
public class FetchTest {  
	public static void main(String[] args) {  
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	      
	    Session session1 = factory.openSession();  
	    Employee emp1 = (Employee)session1.load(Employee.class,1);  
	    System.out.println(emp1.getId()+" "+emp1.getFirstName() +emp1.getLastName()+" "+emp1.getSalary());  
	    session1.close();  
	      
	    Session session2 = factory.openSession();  
	    Employee emp2 = (Employee)session2.load(Employee.class,3);  
	    System.out.println(emp2.getId()+" "+emp2.getFirstName()+emp1.getLastName()+" "+emp2.getSalary());  
	    session2.close();  
	    
	    factory.close();
	      
	}  
}  