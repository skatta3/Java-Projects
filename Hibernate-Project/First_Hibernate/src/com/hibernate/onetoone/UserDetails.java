package com.hibernate.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	@Id @GeneratedValue
	private int userID;
	private String userName;
	
//	@OneToOne
//	@JoinColumn(name="VEHICLE_ID")
//	private Vehicle vehicle;
	
//	@OneToMany
//	@JoinTable(name="USER_VEHICLE", joinColumns = @JoinColumn(name="USER_ID"),
//			inverseJoinColumns = @JoinColumn(name="VEHICLE_ID")
//			)
//	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
//	public Collection<Vehicle> getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Collection<Vehicle> vehicle) {
//		this.vehicle = vehicle;
//	}
	
}
