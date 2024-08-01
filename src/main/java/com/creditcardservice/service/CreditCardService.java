package com.creditcardservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcardservice.entity.CreditCard;
import com.creditcardservice.repo.CreditCardRepo;
import com.creditcardservice.response.CreditCardResponse;

@Service
public class CreditCardService {

	
	@Autowired
	private CreditCardRepo creditcardRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public CreditCardResponse findCreditCardByCustomerId(int customerId) {
		
		CreditCard creditcard=creditcardRepo.findCreditCardByCustomerId(customerId);
		
		CreditCardResponse creditcardResponse=modelMapper.map(creditcard, CreditCardResponse.class);
		
		return creditcardResponse;
		
	}
}
