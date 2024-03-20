package com.java.generics;

//Generic Class
class MyGen<T>{  
	T obj;  
	void add(T obj){
		this.obj=obj;
	}  
	
	T get(){
		return obj;
	}  
} 

//The T type indicates that it can refer to any type (like String, Integer, and Employee).
// The type you specify for the class will be used to store and retrieve the data.