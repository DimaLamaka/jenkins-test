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
    gradle build
    gradle test
    }
   }
   stage('Deploy'){
    steps{
    echo 'Deploying'
     dir("build/libs"){
      java -jar springboot-jenkins-0.0.1-SNAPSHOT.jar
    }
    }
   }
 }
}