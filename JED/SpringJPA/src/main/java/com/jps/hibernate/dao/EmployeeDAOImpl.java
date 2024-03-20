package com.jps.hibernate.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jps.hibernate.model.DepartmentEntity;
import com.jps.hibernate.model.EmployeeEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO 
{
  @PersistenceContext
  private EntityManager manager;
   
  public List<EmployeeEntity> getAllEmployees() 
  {
    List<EmployeeEntity> employees = manager.createQuery("Select a From EmployeeEntity a", EmployeeEntity.class).getResultList();
        return employees;
  }
   
  public List<DepartmentEntity> getAllDepartments() 
  {
    List<DepartmentEntity> depts = manager.createQuery("Select a From DepartmentEntity a", DepartmentEntity.class).getResultList();
        return depts;
  }
   
  public DepartmentEntity getDepartmentById(Integer id) 
  {
        return manager.find(DepartmentEntity.class, id);
  }
   
  public void addEmployee(EmployeeEntity employee) 
  {
    //Use null checks and handle them
    employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
    manager.persist(employee);
  }
}