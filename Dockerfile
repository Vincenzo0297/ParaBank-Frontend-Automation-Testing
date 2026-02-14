FROM eclipse-temurin:8-jdk-alpine
#EXPOSE 8080
COPY target/cucumber-starter-1.0.0-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]