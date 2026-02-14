FROM eclipse-temurin:8-jdk-alpine

EXPOSE 8080

WORKDIR /app

COPY . .

# Run tests on container start
CMD ["mvn", "verify"]
