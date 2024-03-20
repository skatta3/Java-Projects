package com.java.Annotations;

import java.lang.reflect.Method;  


//Applying annotation  
class Hello{  
	@AuthorAnnotation 
	public void sayHello(){
		System.out.println("hello annotation");
		}  
	}  

//Accessing annotation  
public class TestCustomAnnotation1{  
	public static void main(String args[])throws Exception{  
	
		Hello h=new Hello();  
		Method m=h.getClass().getMethod("sayHello");  
		
		AuthorAnnotation manno=m.getAnnotation(AuthorAnnotation.class);  
		System.out.println("value is: "+manno.name());  
	}
}  