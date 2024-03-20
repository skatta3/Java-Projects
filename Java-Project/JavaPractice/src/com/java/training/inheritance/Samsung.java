package com.java.training.inheritance;

public class Samsung extends Mobile{
	
	public void calling() {
		System.out.println("Calling from Samsung Mobile");
	}
	
	public void camera() {
		System.out.println("Camera is on");
	}

}

/**
 * Upcasting
 * 
 * Samsung s = new Samsung();
 * Mobile m = (Mobile)s;
 * 
 * 
 * Mobile m = new Samsung();
 */
