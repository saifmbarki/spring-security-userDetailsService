package com.saif.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.saif.security.security.AppUser;
import com.saif.security.security.AppUserRepo;






@SpringBootApplication
public class SecurityApplication implements CommandLineRunner{


	@Autowired
	AppUserRepo appUserRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		AppUser user = AppUser.builder()
				.username("saifmbk")
				.password("pwd")
				.role("user")
				.build();
		appUserRepo.save(user);
		
		System.out.println("ajout User");
	}

	
	
	
}
