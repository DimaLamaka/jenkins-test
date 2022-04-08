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
    echo 'Build && test'
    sh 'gradle build'
    sh 'gradle test'
    }
   }
   stage('Deploy'){
     echo 'Deploying'
     dir("build/libs"){
      script{
      sh "java -jar springboot-jenkins-0.0.1-SNAPSHOT.jar"
      }
    }
   }
  }
}