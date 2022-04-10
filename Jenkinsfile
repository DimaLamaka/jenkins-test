pipeline{
  agent any
  stages{
   stage('Clone git'){
    steps{
    echo 'Cloning...'
    git url: 'https://github.com/DimaLamaka/jenkins-test'
    }
   }
   stage('Build'){
    steps{
    echo 'Build'
    bat 'gradle clean build'
    }
   }
    stage('Test'){
       steps{
       echo 'Test'
       bat 'gradle test'
       }
      }
   stage('Docker build'){
    steps{
    echo 'Docker building'
    bat 'docker build . -t jenkins/test:latest'
    }
   }
   stage('start Docker build'){
       steps{
       echo 'starting Docker build'
       bat 'docker run -d jenkins/test:latest'
       }
     }
 }
}
