package com.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  {
	   public List<Employee> findByName(String name);	
	   public List<Employee> findByAge(int age);
	   public Employee findByEmail(String email);
	   
	   @Query(value = "SELECT e FROM Employee e ORDER BY name")
	   public List<Employee> findAllSortedByName();

	   @Query(value = "SELECT * FROM Employee ORDER BY name", nativeQuery = true)
	   public List<Employee> findAllSortedByNameUsingNative();

}
