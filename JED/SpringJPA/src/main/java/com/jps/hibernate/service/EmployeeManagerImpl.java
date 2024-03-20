package com.jps.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jps.hibernate.dao.EmployeeDAO;
import com.jps.hibernate.model.DepartmentEntity;
import com.jps.hibernate.model.EmployeeEntity;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
 
  @Autowired
  EmployeeDAO dao;
   
  public List<EmployeeEntity> getAllEmployees() {
    return dao.getAllEmployees();
  }
 
  public List<DepartmentEntity> getAllDepartments() {
    return dao.getAllDepartments();
  }
 
  public void addEmployee(EmployeeEntity employee) {
    dao.addEmployee(employee);
  }
}