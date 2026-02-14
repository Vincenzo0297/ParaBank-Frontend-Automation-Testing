FROM eclipse-temurin:8-jdk-alpine

# Install Maven
RUN apk add --no-cache maven bash git

EXPOSE 8080

WORKDIR /app

COPY target/cucumber-starter-1.0.0-SNAPSHOT.jar app.jar

# Run tests on container start
CMD ["mvn", "verify"]
