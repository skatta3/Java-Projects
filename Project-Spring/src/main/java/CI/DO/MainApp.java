package com.spring.CI.DO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  /**
   * 
   * @author skatt
   * 
   * Constructor Injection with Dependency Object
   *
   */
public class MainApp {  
    public static void main(String[] args) {  
     	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
          
        Employee s=(Employee)context.getBean("e");  
        s.show();  

          
    }  
}  