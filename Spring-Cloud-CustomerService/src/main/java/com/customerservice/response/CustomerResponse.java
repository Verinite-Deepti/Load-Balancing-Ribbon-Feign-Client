package com.customerservice.response;

public class CustomerResponse {

	
	 private int id;
	 private String name;
	 private String email;
     private String age;
     private CreditCardResponse creditcardResponse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public CreditCardResponse getCreditCardResponse() {
		return creditcardResponse;
	}
	public void setCreditCardResponse(CreditCardResponse creditcardResponse) {
		this.creditcardResponse = creditcardResponse;
	}
	
	
	    
	    

	
}
