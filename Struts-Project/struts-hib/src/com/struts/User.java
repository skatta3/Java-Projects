package com.struts;

public class User {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String execute(){
		System.out.println("Ïn User Action Class");
		RegisterDao.saveUser(this);
		return "success";
	}
	
}
