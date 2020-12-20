pipeline {
    agent any
  tools {
    maven 'MAVEN_HOME'
  }

    stages {
        stage('Build') {
            steps {
               
        sh 'mvn -B -DskipTests clean package'


            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
