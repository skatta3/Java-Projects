package com.java.interfaces;

import java.io.Serializable;
import java.rmi.Remote;

interface FederalBank{  
	float rateOfInterest(); 
	void provideEduLoan();
	default void provideNetBanking() {
		System.out.println("Please apply for NetBanking and Collect User credentials from your nearest Bank Branch");
	}
}  

class DCU implements FederalBank,Serializable, Cloneable, Remote{  
	public float rateOfInterest(){
		return 9.15f;
	}  
	public void provideEduLoan() {
		
	}
	
	public void provideNetBanking() {
		System.out.println("DCU is already providing Net Banking");
	}
}  

class CapitalOne implements FederalBank{  
	public float rateOfInterest(){
		return 9.7f;
	}  
	public void provideEduLoan() {
		
	}
}  

public class BanInterface{  
	public static void main(String[] args){  
		FederalBank b=new DCU();  
		System.out.println("ROI: "+b.rateOfInterest());  
		b.provideNetBanking();
	}
}  