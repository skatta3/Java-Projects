package com.yakrut.EmployeeService.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yakrut.EmployeeService.response.AddressResponse;

@FeignClient(name="abc", url = "http://localhost:8081/address-app/api/")
public interface AddressClient { //proxy class

	@GetMapping("/address/{id}")
	AddressResponse getAddressByEmployeeId(@PathVariable("id") int id);
}
