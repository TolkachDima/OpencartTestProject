pipeline {
    agent any

    stages {
        stage('Biuld') {
            steps {
               git 'https://github.com/TolkachDima/OpencartTestProject.git'
               sh './mvnw package'
            }
        }
    }
}
