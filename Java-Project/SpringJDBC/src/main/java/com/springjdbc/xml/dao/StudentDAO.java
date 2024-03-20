package com.springjdbc.xml.dao;

import java.util.List;

import javax.sql.DataSource;

import com.springjdbc.xml.Student;

public interface StudentDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
   */
   public void setDataSource(DataSource ds);
   
   /** 
      * This is the method to be used to create
      * a record in the Student table.
   */
   public void create(Student student);
   
   public boolean deleteRecordbyRollNo(int rollNo);
   public Student getStudent(Integer id);
   
   /** 
     * This is the method to be used to list down
     * all the records from the Student table.
   */
   public List<Student> listStudents();
   
   public List<Student> findByStudentByName(String name);
   public int batchUpdateStudent(List<Student> studentList);

   
   
}