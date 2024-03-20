package com.springjdbc.xml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.springjdbc.xml.dao.StudentDAOImpl;


@Transactional
public class BatchUpdateApp {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      StudentDAOImpl studentDao = (StudentDAOImpl) context.getBean("studentJDBCTemplate");
	      
	      Student ken = new Student();
	      ken.setName("Indra");
	      ken.setAge(15);
	      ken.setId(1);

	      Student jobes = new Student();
	      jobes.setName("Srinivas");
	      jobes.setAge(18);
	      jobes.setId(2);
	           
	      Student mark = new Student();
	      mark.setName("Donald ");
//	      mark.setName("Cathalin");
	      mark.setAge(17);
	      mark.setId(3);	  
	      
//	      studentDao.create(ken);
//	      studentDao.create(jobes);
//	      studentDao.create(mark);
	      
	      List<Student> studentList = new ArrayList<Student>();
	      studentList.add(ken);
	      studentList.add(jobes);
	      studentList.add(mark);
	      
	      int batchUpdateStudent = studentDao.batchUpdateStudent(studentList);
	      
	      System.out.println("Number of Records Updated: " + batchUpdateStudent);
	   }
}
