FROM eclipse-temurin:8-jdk-alpine

RUN apk add --no-cache maven bash git

EXPOSE 8080

WORKDIR /app

COPY . .

# Run tests on container start
CMD ["mvn", "verify"]
