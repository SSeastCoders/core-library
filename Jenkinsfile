pipeline {
    agent any
    stages {
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "mvn -DskipTests clean package sonar:sonar"
                }
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}