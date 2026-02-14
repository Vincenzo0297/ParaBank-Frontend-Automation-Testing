FROM maven:3.9.9-eclipse-temurin-8

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

CMD ["mvn", "verify"]