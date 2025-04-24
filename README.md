# Epic Rap-edia
A fullstack web encyclopedia to explore and organize rich content related to the YouTube channel **Epic Rap Battles of History**.

## Tech stack

### Architecture

- Docker (multi-container setup with backend, database, and dev tooling)

### Frontend

- Language: Typescript
- Framework: React

### Backend

- Language: Kotlin
- Framework: Spring Boot 3
- API type: GraphQL
- Security: Spring Security
- Migrations: Flyway
- ORM: Spring Data JPA (Hibernate)

### Database

- PostgreSQL (containerized)
- DB access via DBeaver (local)

### Other tools

- IDE: IntelliJ IDEA Ultimate

## How to run locally

1. Make sure Docker is installed on your system.
2. Clone the repository and navigate to the `/backend` folder.
3. Run `docker-compose up --build` in a terminal.
4. Your backend will be running on `http://localhost:8080` with **hot reload enabled**. Just build the project (e.g., Ctrl+F9 in IntelliJ) and your changes will be applied instantly.

### Prefer running a production-style JAR?

You can disable hot reload by editing the `Dockerfile`:

- Comment the **DevTools flow (dev)** section
- Uncomment the **JAR flow (prod)** section
