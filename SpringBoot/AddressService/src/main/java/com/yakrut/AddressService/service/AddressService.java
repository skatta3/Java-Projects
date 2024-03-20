package com.yakrut.AddressService.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yakrut.AddressService.entity.Address;
import com.yakrut.AddressService.repo.AddressRepo;
import com.yakrut.AddressService.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int employeeId) {
		Address address = addressRepo.findAddressByEmployeeId(employeeId);
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		return addressResponse;
	}

}