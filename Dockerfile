# Use Maven + Java 11 image (Debian-based)
FROM maven:3.9.9-eclipse-temurin-11

# Set working directory inside container
WORKDIR /app

# Install dependencies
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    curl \
    gnupg \
    ca-certificates \
    fonts-liberation \
    libasound2 \
    libatk-bridge2.0-0 \
    libatk1.0-0 \
    libc6 \
    libcairo2 \
    libcups2 \
    libdbus-1-3 \
    libexpat1 \
    libfontconfig1 \
    libgbm1 \
    libgcc1 \
    libglib2.0-0 \
    libgtk-3-0 \
    libnspr4 \
    libnss3 \
    libpango-1.0-0 \
    libx11-6 \
    libx11-xcb1 \
    libxcb1 \
    libxcomposite1 \
    libxcursor1 \
    libxdamage1 \
    libxext6 \
    libxfixes3 \
    libxi6 \
    libxrandr2 \
    libxrender1 \
    libxss1 \
    libxtst6 \
    xvfb \
    --no-install-recommends

# Install Google Chrome
RUN wget -q https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb \
    && dpkg -i google-chrome-stable_current_amd64.deb || apt-get -fy install \
    && rm google-chrome-stable_current_amd64.deb

# Install ChromeDriver (adjust version to match Chrome)
ARG CHROMEDRIVER_VERSION=117.0.5938.62
RUN wget -O /tmp/chromedriver.zip https://chromedriver.storage.googleapis.com/$CHROMEDRIVER_VERSION/chromedriver_linux64.zip \
    && unzip /tmp/chromedriver.zip -d /usr/local/bin/ \
    && rm /tmp/chromedriver.zip \
    && chmod +x /usr/local/bin/chromedriver

# Set DISPLAY for headless / non-headless
ENV DISPLAY=:99

# Copy project files
COPY . .

# Run Maven tests when container starts (Xvfb provides virtual display)
CMD Xvfb :99 -screen 0 1920x1080x24 & mvn clean verify




# Use Maven + Java 11 image (Debian-based)
#FROM maven:3.9.9-eclipse-temurin-11

# Set working directory inside container
#WORKDIR /app

# Copy all project files
#COPY . .

# Run Maven tests when container starts
#CMD ["mvn", "verify"]


#EXPOSE 8080

#WORKDIR /app

#COPY . .

# Run tests on container start
#CMD ["mvn", "verify"]
