package com.ss.webinar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	
	@GetMapping("/")
	public String handleIndex() {
		return "Java is not an Ocean";
	}

}
