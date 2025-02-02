package com.jacubavicius.hello_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	private RestTemplate restTemplate;
	

	public HelloController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/hello")
	public void helloName() {
		String name = restTemplate.getForObject("http://localhost:8013/name", String.class);
		System.out.println("Hello, " + name + "!");
	}
}
