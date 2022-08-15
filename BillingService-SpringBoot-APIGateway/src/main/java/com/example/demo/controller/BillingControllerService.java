package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillingControllerService {
	@Autowired
	private RestTemplate template;

	@GetMapping("/billing")
	public String doBilling() {
		String resp=template.getForObject("http://localhost:8092/payment", String.class);
		return resp+" Billing  is finished ";
	}

}
