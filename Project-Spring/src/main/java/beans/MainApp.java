package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	/**
	 * XML Based Configuration
	 */
			
//   public static void main(String[] args) {
//      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
// 
//      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
//      obj1.setMessage("Hello World Object 1");
//      obj1.getMessage();
//      
//      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
//      obj2.getMessage();
//   }
   
   
   /*
    * Java based configuration file using Annotations
    */
   public static void main(String[] args) {
	   	ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
	    HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
	    obj1.setMessage("Iam Object 1");
	    obj1.getMessage();
	    
	    HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
	    obj2.getMessage();   
	   
   }
}