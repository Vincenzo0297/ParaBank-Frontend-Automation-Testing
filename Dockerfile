




# Use Maven + Java 11 image (Debian-based)
FROM maven:3.9.9-eclipse-temurin-11

# Set working directory inside container
WORKDIR /app

# Copy all project files
COPY . .

# Run Maven tests when container starts
CMD ["mvn", "verify"]


#EXPOSE 8080

#WORKDIR /app

#COPY . .

# Run tests on container start
#CMD ["mvn", "verify"]
