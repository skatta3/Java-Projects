package com.jps.hibernate.dao;

import java.util.List;

import com.jps.hibernate.model.DepartmentEntity;
import com.jps.hibernate.model.EmployeeEntity;

public interface EmployeeDAO 
{
  public List<EmployeeEntity> getAllEmployees();
  public List<DepartmentEntity> getAllDepartments();
  public void addEmployee(EmployeeEntity employee);
}