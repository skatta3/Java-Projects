package com.yakrut.EmployeeService.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yakrut.EmployeeService.entity.Employee;
import com.yakrut.EmployeeService.repo.EmployeeRepo;
import com.yakrut.EmployeeService.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
//	public Employee getEmployeeById(int id) {
//		Employee employee = EmployeeRepo.findById(id).get();
//		return employee;
//	}
	
//	public EmployeeResponse getEmployeeById(int id) {
//		Employee employee = EmployeeRepo.findById(id).get();
//		
//		EmployeeResponse employeeResponse = new EmployeeResponse();
//		
//		employeeResponse.setId(employee.getId());
//		employeeResponse.setName(employee.getName());
//		employeeResponse.setEmail(employee.getEmail());
//		employeeResponse.setBloodgroup(employee.getBloodgroup());
//		
//		return employeeResponse;
//	}

	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponse getEmployeeById(int id) {
		Employee employee = EmployeeRepo.findById(id).get();
	
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
	
		return employeeResponse;
	}
}
