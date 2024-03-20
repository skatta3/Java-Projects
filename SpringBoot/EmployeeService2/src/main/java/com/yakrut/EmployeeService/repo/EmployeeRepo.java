package com.yakrut.EmployeeService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yakrut.EmployeeService.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
