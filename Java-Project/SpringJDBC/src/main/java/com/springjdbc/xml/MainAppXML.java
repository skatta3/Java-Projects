package com.springjdbc.xml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.xml.dao.StudentDAOImpl;

public class MainAppXML {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      StudentDAOImpl studentDao = (StudentDAOImpl)
         context.getBean("studentJDBCTemplate");
      
      System.out.println("------Records Creation--------" );
      studentDao.create(new Student("Zara", 11));
      studentDao.create(new Student("Nuha", 2));
      studentDao.create(new Student("Ayan", 15));

      
      boolean isDeleted = studentDao.deleteRecordbyRollNo(1);
      if(isDeleted)
    	  	System.out.println("one record Deleted");
      System.out.println("------Listing Multiple Records--------" );
      List<Student> students = studentDao.listStudents();
      
      for (Student record : students) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }  
      
      System.out.println("-------------------------------");
    List<Student> studentList = studentDao.findByStudentByName("Ayan");
      
      for (Student record : studentList) {
         System.out.print("ID : " + record.getId() );
         System.out.print(", Name : " + record.getName() );
         System.out.println(", Age : " + record.getAge());
      }  
   }
}