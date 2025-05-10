pipeline {
    agent any

    tools {
        maven 'mvn_3.9.9'   // Ensure you have this Maven tool configured in Jenkins Global Tools
    }

    stages {
        stage('Code Compilation') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('JUnit TestCase Execution') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Code Packaging') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build completed successfully.'
        }
        failure {
            echo '❌ Build failed.'
        }
    }
}
