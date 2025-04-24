# Epic Rapedia
Web encyclopedia for filter rich information about everything that has to do with Epic Rap Battles of History's YouTube channel.

# Tech stack
- Backend language: Kotlin
- Backend framework: Spring Boot
- API: GraphQL
- Database management system: PostgreSQL
- Database client: DBeaver
- Database migrations: Flyway
- Object relational mapping: Spring Data JPA (Hibernate)
- Security: Spring Security
- Frontend language: Typescript
- Frontend framework: React
- IDE: IntelliJ IDEA 2024.2.2 (Ultimate Edition)

# How to run locally
1. Make sure you have Docker installed.
2. For the API, go into the /backend folder.
3. Open a terminal and execute `docker-compose up --build`.
4. Backend is up. Hot reload is enabled by default, just build and wait a few seconds and you'll have your changes locally deployed.

## Not a fan of hot reload?
You can disable hot reload by going to the Dockerfile and commenting the "Hot reload flow (dev)" section and uncommenting the "JAR flow (prod)" section.
