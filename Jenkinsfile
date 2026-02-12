pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        bat 'mvn -B compile'
      }
    }
    stage('Test'){
      steps{
        bat 'mvn -B clean verify -Dcucumber.filter.tags=@TC1_PARABANK_Registration'
      }
    }
    stage('Frontend-Automation'){
      steps{
        archiveArtifacts 'target/*.jar'
      }
    }
  }
}