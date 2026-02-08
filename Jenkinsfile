pipeline {
  agent none

  stages {

    stage('Backend - Cucumber') {
      agent {
        docker {
          image 'maven:3.8.1-adoptopenjdk-11'
          args '-v /root/.m2:/root/.m2'
        }
      }
      steps {
        sh 'mvn clean test'
      }
    }

    stage('Frontend') {
      agent {
        docker {
          image 'node:16-alpine'
        }
      }
      steps {
        sh 'node --version'
        sh 'npm --version'
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
    }
  }
}
