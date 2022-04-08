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
    bat 'gradle build'
    bat 'gradle test'
    }
   }
    stage('Test'){
       steps{
       echo 'Test'
       bat 'gradle test'
       }
      }
   stage('Deploy'){
    steps{
    echo 'Deploying'
     dir("build/libs"){
      bat 'java -jar springboot-jenkins-0.0.1-SNAPSHOT.jar'
    }
    }
   }
 }
}