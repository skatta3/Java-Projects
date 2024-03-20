package com.yakrut.AddressService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yakrut.AddressService.response.AddressResponse;
import com.yakrut.AddressService.service.AddressService;

@RestController
public class AddressController {
//	@GetMapping("/address")
//	public String getAddress() {
//		return "136, Rosegate ct";
//	}

	@Autowired
	private AddressService addressService;
	
	
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
	
		AddressResponse addressResponse = null;
		
		addressResponse = addressService.findAddressByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);		
	}
}