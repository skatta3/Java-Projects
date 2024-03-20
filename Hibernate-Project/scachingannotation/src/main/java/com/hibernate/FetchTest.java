package com.hibernate;  
  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
  
public class FetchTest {  
	public static void main(String[] args) {  
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
//		
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

	    Session session1=factory.openSession();  
	    Employee emp1=(Employee)session1.load(Employee.class,1);  
	    System.out.println(emp1.getId()+" "+emp1.getFirstName()+" "+emp1.getSalary());  
	    session1.close();  
	      
	    Session session2=factory.openSession();  
	    Employee emp2=(Employee)session2.load(Employee.class,3);  
	    System.out.println(emp2.getId()+" "+emp2.getFirstName()+" "+emp2.getSalary());  
	    session2.close();  
	      
	}  
}  