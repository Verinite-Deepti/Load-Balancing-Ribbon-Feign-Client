package com.creditcardservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.creditcardservice.response.CreditCardResponse;
import com.creditcardservice.service.CreditCardService;


@RestController
public class CreditCardController {

	
	@Autowired
	private CreditCardService creditcardService;
	
	@GetMapping("/creditcard/{customerId}")
	public ResponseEntity<CreditCardResponse> getCreditCardByCustomerId(@PathVariable("customerId") int id) {
		
		CreditCardResponse creditcardResponse=null;
		
	creditcardResponse=creditcardService.findCreditCardByCustomerId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(creditcardResponse);
	}
	
}
