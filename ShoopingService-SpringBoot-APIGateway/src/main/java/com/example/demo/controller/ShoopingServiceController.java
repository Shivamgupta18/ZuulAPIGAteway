package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoopingServiceController {
	@Autowired
	private RestTemplate template;

	@GetMapping("/shopping")
	public String doshopping() {
		String resp = template.getForObject("http://localhost:8093/billing", String.class);
		return resp+"shopping service";
	}

}
