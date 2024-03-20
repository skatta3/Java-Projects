package com.hibernate.ManytoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainAppManyToMany {
	
		public static void main(String[] args) {
			UserDetails user = new UserDetails();
			user.setUserName("Ken Caldwell");
			
			UserDetails user1 = new UserDetails();
			user1.setUserName("Mark Taylor");
			
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleName("Car");
			
			Vehicle vehicle1 = new Vehicle();
			vehicle1.setVehicleName("Bike");
			
			user.getVehicle().add(vehicle);
			user.getVehicle().add(vehicle1);
			
			user1.getVehicle().add(vehicle);
			user1.getVehicle().add(vehicle1);
			
			vehicle.getUserList().add(user);
			vehicle1.getUserList().add(user);
			vehicle.getUserList().add(user1);
			
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();

			session.beginTransaction();
			session.save(user);
			session.save(user1);
			session.save(vehicle);
			session.save(vehicle1);
			
			session.getTransaction().commit();
			session.close();
			
		}

}
