pipeline {
  agent any

  stages {

    stage('Build') {
      steps {
        bat 'mvn -B clean package -DskipTests'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn -B verify -Dcucumber.filter.tags=@TC1_PARABANK_Registration'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts 'target/*.jar'
      }
    }

    stage('Build Docker Image') {
      steps {
        bat 'docker build -t docker-jenkins-app .'
      }
    }

    stage('Deploy Container') {
      steps {
        echo 'Stopping old container (if exists)...'
        bat 'docker stop docker-app || exit 0'
        bat 'docker rm docker-app || exit 0'
        echo 'Running new container...'
        bat 'docker run -d -p 8084:8080 --name docker-app vincenzo0978/frontend-docker:tagname'
      }
    }
  }
}
