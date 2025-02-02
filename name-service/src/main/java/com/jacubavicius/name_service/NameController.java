package com.jacubavicius.name_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

	@GetMapping("/name")
	public String name() {
		return "Gabriella";
	}
}
