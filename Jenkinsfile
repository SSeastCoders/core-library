pipeline {
    agent any
    stages {

        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQubeServer') {
                    sh "mvn clean package sonar:sonar"
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }

    }
}
