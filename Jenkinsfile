pipeline {
    agent any
    stages {
         stage('Test') {
            steps {
                sh 'mvn clean test'
                }
            }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQubeServer') {
                    sh "mvn clean package sonar:sonar"
                }
            }
        }

    }
}
