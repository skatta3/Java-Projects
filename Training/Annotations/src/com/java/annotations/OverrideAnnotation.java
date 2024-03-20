package com.java.annotations;

class Animal{  
	void eatSomething(){
		System.out.println("Animal is eating something");
	}  
}  
  
class Dog extends Animal{  
	@Override  
	void eatSomething(){
		System.out.println("eating foods by Dog");
	}//should be eatSomething  
}  
  
class OverrideAnnotation{  
	public static void main(String args[]){  
		Animal a=new Dog();  
		a.eatSomething();  
	}
}  