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
         stage('Test Postman newman') {
            steps {
				sh "newman run Dxc.postman_collection.json"
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