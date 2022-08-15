package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceController {

	@GetMapping("/payment")
	public String dopayment() {
		return  "Payment  is done here ";
	}
	
}
