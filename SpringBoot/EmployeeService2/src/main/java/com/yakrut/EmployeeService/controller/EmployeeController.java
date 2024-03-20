package com.yakrut.EmployeeService.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yakrut.EmployeeService.response.EmployeeResponse;
import com.yakrut.EmployeeService.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
		EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}
	
}
