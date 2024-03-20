package com.training.server.main.user;

import java.io.Serializable;

import javax.validation.constraints.Size;



public class User implements Serializable
	{
	private static final long serialVersionUID = 1420672609912364060L;
	
	private Integer id;
	@Size(min=5, message="Name should have atleast 5 characters")
	private String name;
	private String dob;
	
	//default constructor	
	protected User()
	{
		
	}
	
	public User(Integer id, String name, String dob) 
		{
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		}

	public Integer getId() 
		{
		return id;
		}
	public void setId(Integer id) 
		{
		this.id = id;
		}
	
	public String getName() 
		{
		return name;
		}
	public void setName(String name) 
		{
		this.name = name;
		}
	
	public String getDob() 
		{
		return dob;
		}
	public void setDob(String dob) 
		{
		this.dob = dob;
		}
	
	@Override
	public String toString() 
		{
		//return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
		return String.format("User [id=%s, name=%s, dob=%s]", id, name, dob);
		}
}
