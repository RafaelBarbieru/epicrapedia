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
RUN mvn package -DskipTests
COPY . .

# Runtime phase
FROM eclipse-temurin:21-jdk-alpine
WORKDIR app/

# Copy the .jar file from the build
COPY --from=build /app/target/*.jar app.jar

# Set Spring active profile
ENV SPRING_PROFILES_ACTIVE=local

# Execute app
ENTRYPOINT ["java", "-jar", "app.jar"]