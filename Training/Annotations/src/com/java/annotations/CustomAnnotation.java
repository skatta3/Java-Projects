package com.java.annotations;

//Creating annotation  
import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  // Single Value Annotation
	int value();  
}  

//Applying annotation  
class Hello{  
	@MyAnnotation(value=10)  
	public void sayHello(){
		System.out.println("hello annotation");
	}  
}  

//Accessing annotation  
class CustomAnnotation{  
	public static void main(String args[])throws Exception{  
		Hello h=new Hello();  
		Method m=h.getClass().getMethod("sayHello");  
		
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+manno.value());  
	}
}  