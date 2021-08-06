pipeline {
    agent any
    stages {
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "mvn sonar:sonar -Dsonar.login=1b0e1884a823086babbc973b407a074299b57505"
                }
            }
        }
        stage('Quality Gate'){
            steps {
                waitForQualityGate(abortPipeline= true, credentialsId:'Sonarqube Secret')
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            archiveArtifacts artifacts: '**/*.jar'
        }
    }
}
