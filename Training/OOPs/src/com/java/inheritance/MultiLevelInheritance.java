package com.java.inheritance;

class Animal1{  
	void eat(){
		System.out.println("eating...");
	}  
}  

class Dog1 extends Animal1{  
	void bark(){
		System.out.println("barking...");
	}  
}  

class BabyDog extends Dog1{  
	void weep(){
		System.out.println("weeping...");
	}  
}  

public class MultiLevelInheritance{  
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  // its own method
		d.bark();  // Method from its parent class
		d.eat();   // Method from its Grand Parent class
	}
}  