package com.creditcardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudCreditCardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCreditCardServiceApplication.class, args);
	}

}
