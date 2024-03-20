package com.java.interfaces;

interface SDrawable{  
	void draw();  
	static int cube(int x){
		return x*x*x;
	}  
}  

class SRectangle implements SDrawable{  
	public void draw(){
		System.out.println("drawing rectangle");
	}  
}  
  
public class TestInterfaceStatic{  
	public static void main(String args[]){  
		SDrawable d=new SRectangle();  
		d.draw();  
		System.out.println(SDrawable.cube(3));  
	}
}  