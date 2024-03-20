package com.java.encapsulation;

//A Java class which has only setter methods.  
public class WriteOnlyStudent{  
	//private data member  
	private String college;  
	
	//getter method for college  
	public void setCollege(String college){  
		this.college=college;  
	}

	public String getCollege() {
		return college;
	}  
}  