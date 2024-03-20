package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      objA.setMessage("I'm object A");
  

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld"); // objB == objA
 //     objB.setMessage("I'm object B");
      objA.getMessage();
      objB.getMessage();
   }
}