pipeline {
    agent any

    stages {
        stage('clean') {
            steps {
				sh "mvn clean"
            }
        }
        stage('test') {
            steps {
				sh "mvn test"
            }
        }
        stage('compile') {
            steps {
				sh "mvn compile"
            }
        }
        stage('Run APP'){
            steps {
                sh 'mvn spring-boot:run &'
            }
        }
        stage("Sleep"){
            steps {
                sh 'sleep 20'
            }
        }
    }
}