pipeline {
    agent {
        docker { image 'java:latest' }
    }
    stages {
        stage('Test') {
            steps {
                bat 'java --version'
            }
        }
    }
}