package com.saif.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.saif.security.security.AppUser;
import com.saif.security.security.AppUserRepo;






@SpringBootApplication
public class SecurityApplication implements CommandLineRunner{


	@Autowired
	AppUserRepo appUserRepo;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
	
		
		AppUser user = AppUser.builder()
				.username("saifmbk")
				.password(passwordEncoder.encode("mbk"))
				.role("user")
				.build();
		appUserRepo.save(user);
		
		AppUser user2 = AppUser.builder()
				.username("ghaithmbk")
				.password(passwordEncoder.encode("mbk"))
				.role("admin")
				.build();
		appUserRepo.save(user2);
		
		
		System.out.println("ajout User 1 et 2");
		
		/****/

		
	}
	
	


	
	
}
