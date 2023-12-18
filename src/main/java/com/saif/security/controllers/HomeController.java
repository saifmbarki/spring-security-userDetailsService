package com.saif.security.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Cette petite application GUI gère l'authentification "
        		+ "des utilisateurs en utilisant les technologies Spring Boot, "
        		+ "Spring Security et UserDetailsService. En naviguant vers la page d'accueil ('/'),"
        		+ " vous pouvez accéder à une page non sécurisée. Pour accéder à la page '/secured', "
        		+ "une simple authentification est nécessaire, "
        		+ "permettant ainsi de restreindre l'accès à des utilisateurs authentifiés."
        		+ " De plus, la page '/admin' exige un rôle d'administrateur pour y accéder,"
        		+ " démontrant ainsi la gestion fine des autorisations grâce à Spring Security.";
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
