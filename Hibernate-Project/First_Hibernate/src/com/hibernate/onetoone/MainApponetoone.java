package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainApponetoone {
	
		public static void main(String[] args) {
			UserDetails user = new UserDetails();
			user.setUserName("Ken Caldwell");
			
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleName("Car");
			
//			//OneToOne
//			user.setVehicle(vehicle);
			
			//OneToMany;
			Vehicle vehicle1 = new Vehicle();
			vehicle1.setVehicleName("Bike");
			
//			user.getVehicle().add(vehicle);
//			user.getVehicle().add(vehicle1);
			
			//Many-To-One
			vehicle.setUser(user);
			vehicle1.setUser(user);
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();

			session.beginTransaction();
			session.save(user);
			session.save(vehicle);
			session.save(vehicle1);
			
			session.getTransaction().commit();
			session.close();
			
		}

}
