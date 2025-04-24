# Build phase
FROM eclipse-temurin:21-jdk-alpine AS build

# Install Maven
RUN apk add --no-cache maven

# Set working directory to app/
WORKDIR app/

# Compile the .jar file
COPY pom.xml .
RUN mvn dependency:resolve
COPY src ./src
RUN mvn package -DskipTests -Dmaven.repo.local=target/dependency
COPY . .

# Runtime phase
FROM eclipse-temurin:21-jdk-alpine
WORKDIR app/

# JAR flow (prod)
#COPY --from=build /app/target/*.jar app.jar
#ENV SPRING_PROFILES_ACTIVE=local
#ENTRYPOINT ["java", "-jar", "app.jar"]

# Hot reload flow (dev)
COPY --from=build /app/target/classes /app/target/classes
COPY --from=build /app/target/dependency /app/target/dependency
ENTRYPOINT ["java", "-cp", "target/classes:target/dependency/*", "me.rbarbieru.epicrapedia.EpicrapediaApplicationKt"]
