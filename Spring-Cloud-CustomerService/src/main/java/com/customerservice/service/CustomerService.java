package com.customerservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.entity.Customer;
import com.customerservice.feignclient.CreditCardClient;
import com.customerservice.repo.CustomerRepo;
import com.customerservice.response.CreditCardResponse;
import com.customerservice.response.CustomerResponse;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo CustomerRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private	CreditCardClient creditcardClient;
	
	 
	public CustomerResponse getCustomerById(int id) {

		 CreditCardResponse creditcardResponse=creditcardClient.getCreditCardByCustomerId(id);
		 
	 Customer customer = CustomerRepo.findById(id).get();
   CustomerResponse customerResponse= modelMapper.map(customer, CustomerResponse.class);
	 
   customerResponse.setCreditCardResponse(creditcardResponse);
	
   return customerResponse;
   
   
	 }
}