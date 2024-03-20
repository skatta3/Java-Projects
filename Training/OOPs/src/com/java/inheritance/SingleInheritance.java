package com.java.inheritance;

//Single level Inheritance
//Base class or Super class or Parent class
class Animal{  
	Animal() {
		System.out.println("Constructor of Animal Class");
	}
	private void eat(){
		System.out.println("eating...");
	}  
}  


// Derived Class or Child Class or sub class or extended class
class Dog extends Animal{  
	Dog() {
		System.out.println("Constructor of Dog Class");
	}
	void bark(){
		System.out.println("barking...");
	}  
}  

public class SingleInheritance{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.bark();  // Sub class which is Dog class
//		d.eat();   // Parent class method which is Animal
	}
}  