package com.spring.DI;

public class Address {
	private String lane1;
	private String lane2;
	private String city;
	private String state;
	private String country;
	private String zip;
	public String getLane1() {
		return lane1;
	}
	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}
	public String getLane2() {
		return lane2;
	}
	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [lane1=" + lane1 + ", lane2=" + lane2 + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zip=" + zip + "]";
	}

}
