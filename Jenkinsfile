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
        cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
      }
    }
    stage('Frontend-Automation'){
      steps{
        archiveArtifacts 'target/*.jar'
      }
    }
  }
}