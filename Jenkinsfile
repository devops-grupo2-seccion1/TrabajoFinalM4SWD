pipeline {
    agent any

    stages {
        stage('paso1') {
            steps {
				sh "mvn clean"
            }
        }
        stage('paso2') {
            steps {
				sh "mvn compile"
            }
        }
        stage('paso3') {
            steps {
				sh "mvn verify -Pperformance"
            }
        }
    }
}