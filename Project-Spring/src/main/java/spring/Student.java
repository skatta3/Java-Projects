package com.java.spring;

public class Student {
	
	private int id;
	private String name;
	
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public Student(int id , String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
