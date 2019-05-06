package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/getGradle")
	public String getGradle() {
		return "<h1>Hello Gradle</h1>";
	}
}
