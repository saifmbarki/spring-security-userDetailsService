# Application d'Authentification avec Spring Boot et Spring Security

Cette petite application a été créée par [saifmbarki](https://github.com/saifmbarki/] pour gérer l'authentification des utilisateurs en utilisant les frameworks Spring Boot, Spring Security et UserDetailsService. Voici un aperçu des fonctionnalités :

- **Page d'Accueil ('/') :** Vous pouvez librement naviguer sur cette page, car elle n'est pas sécurisée.

- **Page Sécurisée ('/secured') :** L'accès à cette page nécessite une simple authentification, démontrant ainsi la gestion des utilisateurs authentifiés.

- **Page d'Administration ('/admin') :** Pour accéder à cette page, un rôle d'administrateur est requis, illustrant ainsi la gestion fine des autorisations avec Spring Security.

N'hésitez pas à explorer les différentes fonctionnalités et à contribuer au développement de cette application. Pour exécuter localement, assurez-vous d'avoir Spring Boot installé et utilisez la commande `./mvnw spring-boot:run`.
