package com.creditcardservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardConfig {

	
	@Bean
	
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}

