package com.saif.security.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long>{

	
	AppUser findByUsername(String username);
}
