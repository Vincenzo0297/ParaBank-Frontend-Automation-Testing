FROM eclipse-temurin:8-jdk-alpine

EXPOSE 8080

COPY target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar

ENTRYPOINT ["java","-jar","/docker-jenkins-integration-sample.jar"]
