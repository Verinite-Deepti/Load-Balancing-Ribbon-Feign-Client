package com.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.entity.Customer;
import com.customerservice.repo.CustomerRepo;
import com.customerservice.response.CustomerResponse;
import com.customerservice.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers/{id}")
   ResponseEntity<CustomerResponse> getcustomerDetails(@PathVariable("id") int id){
	CustomerResponse customerResponse=customerService.getCustomerById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
	}
	
}
