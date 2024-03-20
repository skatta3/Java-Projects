package com.jps.hibernate.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name="employee")
public class EmployeeEntity implements Serializable 
{
  private static final long serialVersionUID = 1L;
 
  @Id
  @GeneratedValue
  private Integer id;
   
  @NotEmpty
  private String firstName;
  private String lastName;
  private String email;
   
  @NotNull
  @ManyToOne
  private DepartmentEntity department;
   


public EmployeeEntity() {}
    
    public EmployeeEntity(String name, DepartmentEntity department) {
        this.firstName = name;
        this.department = department;
    }
      
    public EmployeeEntity(String name) {
        this.firstName = name;
    }
 
  //Setters and Getters
    public DepartmentEntity getDepartment() {
    	return department;
      }

	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}
 
  @Override
  public String toString() {
    return "EmployeeVO [id=" + id + ", firstName=" + firstName
        + ", lastName=" + lastName + ", email=" + email
        + ", department=" + department + "]";
  }
}