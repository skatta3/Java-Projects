package com.hibernate.collections;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	@Id @GeneratedValue
	private int userID;
	private String userName;
	
	@ElementCollection // To Mark it as separate Table
	@JoinTable(name="USER_ADDRESS",
			joinColumns = @JoinColumn(name="USER_ID")
	)
	private Set<Address> listOfAddress = new HashSet();
	
	public Set<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

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
	
}
