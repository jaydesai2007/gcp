package com.test.gcp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
	
	@GetMapping("/test")
	public String getTest() {
		return "hello";
	}

}
