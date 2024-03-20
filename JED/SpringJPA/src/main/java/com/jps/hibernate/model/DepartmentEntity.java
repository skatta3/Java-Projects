package com.jps.hibernate.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="department")
public class DepartmentEntity implements Serializable {
 
  private static final long serialVersionUID = 1L;
   
  @Id
  @GeneratedValue
  private Integer id;
  private String name;
   
  public DepartmentEntity(){
  }
 
  public DepartmentEntity(Integer id, String name) {
    super();
    this.id = id;
    this.name = name;
  }
   
  @OneToMany(mappedBy="department",cascade=CascadeType.PERSIST)
    private List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();
   
  //Setters and Getters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	} 
  
   
  @Override
  public String toString() {
    return "DepartmentVO [id=" + id + ", name=" + name + "]";
  }

}