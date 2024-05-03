# Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf

Ce projet est divisé en trois parties, chacune correspondant à une branche différente :
- La partie 1 se trouve dans la branche `part1`.
- La partie 2 se trouve dans la branche `part2`.
- La partie 3 se trouve dans la branche `part3`.

## Partie 1

La partie 1 du projet consiste à créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :

1. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombok et Thylemeaf et DevTools
   
   ![cree projet](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/3d943d32-36dc-4856-b54c-54f3585cc2d5)
   
2. Créer l'entité JPA Patient ayant les attributs :

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/1f5597c6-9374-4df2-a512-2dae311fdc43)
   
3. Ajouter un nouvel objet patient de quatre manières :
   
   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/146026ab-8e0a-4005-b2b3-873bbd8c1c2a)
   
4. Configurer le fichier application.properties pour H2 database :

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/23a102ee-e7a8-4d1d-aee8-bac342a44c12)
   
5. Ajouter de nouvelles dépendances mySql et webjar et bootstrap et bootstrap-icone:

![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/174a82e1-2af4-46ff-b507-985bcfb47ab1)

6. Création d'un Web Service pour interagir avec la base de données MySQL et un moteur de template Thylemeaf :
    
   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/16c7d477-026b-42c6-9498-327400173c70)
   
   ![THy](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/13078730-87f6-496a-9251-7099e73fd8c6)
   
   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/5ae5f21e-eb59-433a-bf31-5121653a8d1f)


## Partie 2

La partie 1 du projet consiste à créer une page template et faire la validation des formulaires :

1. Ajouter les dépendances nécessaires :

   ![Capture d’écran 2024-04-27 001803](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/b3229990-d03d-48ab-a71f-15c73c9145d7)
   
   ![Capture d’écran 2024-04-27 153135](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/ce8f42cb-c07b-442b-ba94-4b8713dfa049)

3. Créer une page template :
   
  ![Capture d’écran 2024-05-02 230357](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/eed37284-483a-4f23-9f82-aceee333d445)
  
  ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/13353f44-31aa-472b-be4f-a43e499fb10d)

3. Créer une formulaire :

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/28f039cc-73bb-40fa-9e6d-6076c422fabe)

4. Validation de formulaire :

![Capture d’écran 2024-05-02 231054](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/98a7921c-30c4-418a-9310-70cd08019a4e)

5. Modifier Patient :

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/e0c5aa28-a37d-4c5e-9b0e-d934455fb283)
   
   ![Capture d’écran 2024-05-02 231643](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/957a7726-2f2f-47ef-913e-68655010cc71)
   
  ![Capture d’écran 2024-05-02 231626](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/f9b9f563-a156-4d71-9d8a-d4dfbe565e74)

  ![Capture d’écran 2024-05-02 231600](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/e3ddb128-90b7-4eaa-bec6-00cf372784f4)


  ## Partie 3

  La partie 3 du projet consiste à sécurité avec Spring security:

1. InMemomy Authentication :
   a. Ajouter de nouvelle dépendance Spring Security :

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/f688a1f1-988f-4691-b4b8-89ed70b501a7)

   b. Creér une classe de configuration :

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/069b161a-e431-4f5d-a747-a947c4bc55bf)

   c. Ajouter l'intrface SecurityFilterChain configurer une chaîne de filtres de sécurité

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/12350092-cc8e-4a2e-bfda-d924146e07a8)

   ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/f06e5d35-e6e9-4cd1-9806-dc4021e61d1c)

   d. Les serveurs génèrent des jetons CSRF pour protéger les formulaires contre les attaques :
  
   ![Capture d’écran 2024-05-03 180022](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/51c1bd86-fcf5-4406-ad31-264c848dc52b)

   e. Crée un gestionnaire d'utilisateurs en mémoire pour l'authentification dans une application Spring Security :
       
       @Bean
       public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
           return new InMemoryUserDetailsManager(
                   User.withUsername("user1").password(passwordEncoder.encode("1234")).roles("USER").build(),
                   User.withUsername("Admin1").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()
           );
       }

    f. Intégrer Thymeleaf avec Spring Security : 

    ![image](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/145de8c2-fc5e-453a-b668-77a51791772f)

    ![Capture d’écran 2024-05-03 184626](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/8bff7f97-20b0-4b8e-8d7d-d48161df90a0)

    j. Préciser de créer notre propre login :
    
    ![Capture d’écran 2024-05-03 184753](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/0c01741e-0059-4316-98ff-47e012141dc3)

    ![Capture d’écran 2024-05-03 184719](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/fe23e333-fcdd-4f50-b0d1-18370b5a89de)

    ![Capture d’écran 2024-05-03 184822](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/bf400968-efa1-4f67-b2e1-575ca1ad00cc)
    
2. JDBC Authentication :

   a. Ajouter la dépendance JDBC:

   ![Ajouter  Jdbc](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/0423ae8f-6897-4530-a5fe-f898abee46bb)

   b. Créer la table des utilisateurs :

   ![Create table user](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/28a5465a-7f92-4207-ad4f-6edcb21f6df8)

   c. Configurer la source de données et l'authentification JDBC 

   ![addconfig](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/a6dc5615-e411-46cd-9c01-d22f9bf0076e)

   d. Ajouter des utilisateurs à la base de données avec CommandeLine :

   ![Ajouter user avec commande line](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/5d554d50-99f3-4b0f-9413-4761e6571731)

3. UserDetails Service :

   Préciser de créer notre propre façon de gérer les utilisateurs et les rôles de creer notre propre methode pour gerer les utilisateurs et roles :

   a. Ajouter une nouvelle entité et repository pour l'utilisateur et le rôle :

   ![Ajouter nouveau entiite et repo pour user et role ](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/108b2e6c-9219-4513-b9d0-c9c70cb66ce4)
   
   ![AppUser role](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/69d3a90d-c4d4-4a90-b0ab-220bba8ab1ed)

   b. Gestion des rôles et des utilisateurs via notre service :

   ![gere role et  utilisaeur avec notre service](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/1b8dbeea-f16a-4f82-8be0-95d93c53241f)

   c. Notre propre UserDetailsService :
   
   ![UserDetailsService Auth](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/ad047a48-f2ca-4f92-8e44-e5a13ab525df)

   d.  Ajouter nouveau service à httpSecurity:

   ![Implemente  UserDetailsService Auth](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/428f0d21-d90f-40eb-98ba-bdca8f51f1e7)

   e. Tester  avec CommandLineRunner : 

   ![Tester les nouvaux fonction de notre service de sucirity](https://github.com/S-AHANSAL/Activite-Pratique-N-3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/81721069/a18bfa60-f0ac-4072-baf4-d171a897e41a)








