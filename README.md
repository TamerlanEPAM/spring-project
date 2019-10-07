# Spring project
Create CRUD spring application based on the ER model you created in E-R Model case studies 

### Technology stack:

* Build tool: Maven.
* Application container: Spring IoC (Spring Framework version 5.x).
* Logging framework: SLF4J.
* Testing/Mocking frameworks: JUnit (4.x or 5.x), Mockito (usage of annotations: @Mock, @Spy, etc.), Mockmvc
* Database: PostgreSQL (version 9.x is preferred, but you can use 10.x).
* Database VCS: Flyway as VCS for database. Don't forget to add initial scripts to resources.
* Lombok
### Tech requirements:

1. Clear layered structure should be used with responsibilities of each application layer defined.
2. All Spring-related configuration should be done using Java config.
3. Use Lombok actively
4. Spring JDBC Template should be used for data access. 
5. Use Flyway to create database and apply following changes
6. Repository layer should be tested using integration tests with an in-memory embedded database.
7. Provide required controllers and views for application (UI framework choise is up to you).
8. Controllers should be tested using Mockmvc.
9. Implement generic exception handler which should redirect all controller exceptions to view, that just prints exception message.