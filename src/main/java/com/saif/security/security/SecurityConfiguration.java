package com.saif.security.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	
	@Autowired
	UserDetailsServiceImpl userDetailsServiceImpl;

	
	@SuppressWarnings("removal")
	@Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/","/h2-console/**").permitAll()
                .requestMatchers("/admin").hasRole("admin")
                .anyRequest().authenticated()
            )
            .headers(headers -> headers.frameOptions().disable())
            .csrf(csrf -> csrf
                    .ignoringRequestMatchers("/h2-console/**"))
            .formLogin(Customizer.withDefaults())
        	.userDetailsService(userDetailsServiceImpl);
        return http.build();
    }
	
	
	
	

}
