package com.saif.security.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{

	AppUserService appUserService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser user = appUserService.loadAppUserByUsername(username);
		if(user == null) throw new UsernameNotFoundException("not found");
		
		//@SuppressWarnings("deprecation")
		UserDetails userDetails = User
				.withUsername(user.getUsername())
				.password(user.getPassword())
				.roles(user.getRole())
				.build();
		return userDetails;
	}

}