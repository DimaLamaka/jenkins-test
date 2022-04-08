node{
  docker.image('java:latest').inside{
     stage('check'){
     echo 'Check...'
           bat 'java --version'
     }
     stage('Clone git'){
         echo 'Cloning...'
         git url: 'https://github.com/DimaLamaka/jenkins-test'
         }
        stage('Build'){
         echo 'Build'
         bat 'gradle build'
         }
         stage('Test'){
            echo 'Test'
            bat 'gradle test'
            }
        stage('Deploy'){
         echo 'Deploying'
          dir("build/libs"){
           bat 'java -jar springboot-jenkins-0.0.1-SNAPSHOT.jar'
         }
         }
        }
}