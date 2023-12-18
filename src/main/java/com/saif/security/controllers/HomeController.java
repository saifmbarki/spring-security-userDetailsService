package com.saif.security.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "This is the index page";
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal UserDetails userDetails) {
    	 return "Secured page, Bonjour " + userDetails.getUsername();
    }

    @GetMapping("/admin")
    public String admin(@AuthenticationPrincipal UserDetails userDetails) {
    	return "Admin page, Bonjour " + userDetails.getUsername();
    }

}
