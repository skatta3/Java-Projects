package com.yakrut.EmployeeService.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yakrut.EmployeeService.entity.Employee;
import com.yakrut.EmployeeService.feignclient.AddressClient;
import com.yakrut.EmployeeService.repo.EmployeeRepo;
import com.yakrut.EmployeeService.response.AddressResponse;
import com.yakrut.EmployeeService.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/** 
	 * Spring will create the implementation for the class and will 
	 * inject the bean here (proxy)
	 */
	@Autowired
	private AddressClient addressClient; 
	
	public EmployeeResponse getEmployeeById(int id) {
		Employee employee = EmployeeRepo.findById(id).get();
	
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
	
		AddressResponse addressResponse = addressClient.getAddressByEmployeeId(id);
		employeeResponse.setAddressResponse(addressResponse);
		return employeeResponse;
	}
}