pipeline{
  agent { docker { image 'java:latest' } }
  stages{
  stage('check'){
      steps{
      echo 'Check...'
      bat 'java --version'
      }
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
    }
   }
    stage('Test'){
       steps{
       echo 'Test'
       bat 'gradle test'
       }
      }
      stage('Copy'){
             steps{
             echo 'Copy'
             bat 'docker build .'
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
}