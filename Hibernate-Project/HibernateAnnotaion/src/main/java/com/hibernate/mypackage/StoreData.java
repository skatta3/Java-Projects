package com.hibernate.mypackage;  
  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
  
public class StoreData {  
	public static void main(String[] args) {  
	      
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction(); 
	     try {
		    Employee e1=new Employee();  
		    e1.setId(207);  
		    e1.setFirstName("Ram");  
		    e1.setLastName("Patel");  
		    session.save(e1);
		    
		    
		    Employee e2=new Employee();  
		    e2.setId(208);  
		    e2.setFirstName("Shyam");  
		    e2.setLastName("P");  
		      
		    session.save(e2);
			t.commit();
	     } catch (Exception e) {
	    	 t.rollback();
	    	 e.printStackTrace();
	     }
	    System.out.println("successfully saved");  
		factory.close();
	    session.close();  
	      
	}  
}  