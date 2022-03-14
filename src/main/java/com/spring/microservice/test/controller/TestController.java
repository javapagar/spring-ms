package com.spring.microservice.test.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="test", produces = MediaType.TEXT_PLAIN_VALUE)
	public String testingController() {
		return "Everything is OK!";
	}
}
