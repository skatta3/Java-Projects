package com.jps.hibernate.service;

import java.util.List;

import com.jps.hibernate.model.DepartmentEntity;
import com.jps.hibernate.model.EmployeeEntity;

public interface EmployeeManager 
{
  public List<EmployeeEntity> getAllEmployees();
  public List<DepartmentEntity> getAllDepartments();
  public void addEmployee(EmployeeEntity employee);
}
