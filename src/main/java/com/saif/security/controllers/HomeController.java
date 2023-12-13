package com.saif.security.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	

	@GetMapping("/")
	public String index() {
		return "this is index page";
	}
	
	@GetMapping("/secured")
	public String secured() {
		return "la page secured";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "la page admin";
	}
	
}
