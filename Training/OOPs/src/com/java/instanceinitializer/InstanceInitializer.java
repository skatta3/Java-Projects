package com.java.instanceinitializer;

public class InstanceInitializer {
   int speed;  
      
   //Default Constructor
   InstanceInitializer(){
	   speed = 125;
	   System.out.println("Calling Default Constructor........");
	   System.out.println("speed is "+speed);
   }  
   
   //Argument Constructor
   InstanceInitializer(int spd){
	   System.out.println("Calling Argument Constructor........");
	   System.out.println("speed is "+spd);
   }  
   
  //Instance Initialization Block
   {
	   System.out.println("Calling Instance Initialization Block.........");
	   System.out.println("speed is "+speed);
    }  //Instance Initialization Block
   

    public static void main(String args[]){  
    	InstanceInitializer b1=new InstanceInitializer();  
    	
    	InstanceInitializer b2=new InstanceInitializer(45);  
    }      
}