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
         stage('testnewman') {
            steps {
				sh "newman run laboratorio modulo 4.postman_collection.json"
            }
        }
        stage('compile') {
            steps {
				sh "mvn compile"
            }
        }
        stage('verify') {
            steps {
				sh "mvn verify -Pperformance"
            }
        }
    }
}