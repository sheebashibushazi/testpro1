pipeline {
    agent any
  tools {
    maven 'MAVEN_HOME'
  }

    stages {
        stage('Build') {
            steps {
             git 'https://github.com/sheebashibushazi/testpro1.git'  
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
