package com.java.interfaces;

interface IDrawable{  
	void draw();  
	default void msg(){
		System.out.println("default method");
	}  
}  

class IRectangle implements IDrawable{  
	public void draw(){
		System.out.println("drawing rectangle");
	}  
}  

public class TestInterfaceDefault{  
	public static void main(String args[]){  
		IDrawable d=new IRectangle();  
		d.draw();  
		d.msg();  
	}
}  