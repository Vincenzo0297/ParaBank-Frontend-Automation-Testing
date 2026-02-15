# Use Maven + Java 11 image (Debian-based)
FROM maven:3.9.9-eclipse-temurin-11

# Install extra tools (bash, git, curl)
RUN apt-get update && apt-get install -y \
    bash \
    git \
    curl \
    && rm -rf /var/lib/apt/lists/*

# Set working directory inside container
WORKDIR /app

# Copy all project files
COPY . .

# Run Maven tests when container starts
CMD ["mvn", "clean", "verify"]


#EXPOSE 8080

#WORKDIR /app

#COPY . .

# Run tests on container start
#CMD ["mvn", "verify"]
