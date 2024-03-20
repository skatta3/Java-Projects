package com.hibernate.proxy;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;
	private String userName;
	
//	//Default behaviour -- LAZY
//	@ElementCollection // To Mark it as separate Table
//	@JoinTable(name="USER_ADDRESS",
//			joinColumns = @JoinColumn(name="USER_ID")
//	)
	
//	//EAGER Loading
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="USER_ADDRESS",
			joinColumns = @JoinColumn(name="USER_ID")
	)
	@GenericGenerator(name = "increment-gen", strategy = "increment")
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "increment-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddress = new ArrayList<Address>();
	


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
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
}
