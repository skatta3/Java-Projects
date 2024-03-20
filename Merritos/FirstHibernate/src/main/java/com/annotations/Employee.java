package com.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
   @Id 
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   @Column(name = "id")
   private int id;

   private String firstName;

   private String lastName;

   private String userEmail;  

   public Employee() {
	   
   }
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   
   public String getUserEmail() {
      return userEmail;
   }
   
   public void setUserEmail( String userEmail ) {
      this.userEmail = userEmail;
   }
}