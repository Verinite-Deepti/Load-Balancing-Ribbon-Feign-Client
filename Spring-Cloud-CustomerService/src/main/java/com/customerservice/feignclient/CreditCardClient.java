package com.customerservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customerservice.response.CreditCardResponse;

@FeignClient(name = "creditCardService", url = "http://localhost:8081/spring-cloud-creditcardservice/api")
public interface CreditCardClient {

    @GetMapping("/creditcard/{id}")
    CreditCardResponse getCreditCardByCustomerId(@PathVariable("id") int id);
}
