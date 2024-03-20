package com.spring.setterDI.DO;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  
  
public class MainApp {  
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext-setterDO.xml");  
	    BeanFactory factory = new XmlBeanFactory(r);      

//     	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-setterDO.xml");

	    Employee e=(Employee)factory.getBean("obj");  
	    e.displayInfo();  
	    
	    Employee e1=(Employee)factory.getBean("obj1");  
	    e1.displayInfo();  	  
	}  
}  