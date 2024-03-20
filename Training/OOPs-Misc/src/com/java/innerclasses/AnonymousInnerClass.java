package com.java.innerclasses;

abstract class Person{  
	  abstract void eat();  
}  

public class AnonymousInnerClass {
	 public static void main(String args[]){  
		 Person p=new Person(){  
			 void eat(){
				 System.out.println("nice fruits");
			 }  
		 };  
		 p.eat();  
	 }  
} 



//Internal Working of given code
//Person p=new Person(){  
//void eat(){System.out.println("nice fruits");}  
//};  

//Internal Working: A class is created but its name is decided by the compiler which extends the Person class and provides the implementation of the eat() method.
//An object of Anonymous class is created that is referred by p reference variable of Person type.