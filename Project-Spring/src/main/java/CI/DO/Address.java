package com.spring.CI.DO;

public class Address {  
	private String city;  
	private String state;  
	private String country;  
	private String zip;
	  
	public Address(String city, String state, String country,String zip) {  
	    super();  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;
	    this.zip = zip;
	}  
	  
	public String toString(){  
	    return city+" "+state+" "+country +" "+zip;  
	}  
}  