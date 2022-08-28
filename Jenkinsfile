pipeline {
    agent any

    stages {
        stage('Biuld') {
            steps {
               git 'https://github.com/TolkachDima/OpencartTestProject.git'
               sh './mvnw package'
            }
        }
        stage('Test'){
            sh './mvnw test'
        }

        post {
            always {
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
    }
}
