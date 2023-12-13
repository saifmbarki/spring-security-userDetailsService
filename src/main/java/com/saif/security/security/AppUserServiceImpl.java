package com.saif.security.security;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class AppUserServiceImpl implements AppUserService{

	
	
	AppUserRepo appUserRepo;
	
	
	@Override
	public AppUser loadAppUserByUsername(String username) {
		return appUserRepo.findByUsername(username);
	}

}
