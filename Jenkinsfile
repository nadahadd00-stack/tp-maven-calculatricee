pipeline {
    agent any

    tools {
        maven 'Maven_3.9.x'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Code source récupéré.'
            }
        }

        stage('Build') {
            steps {
                echo 'Début du build Maven...'
                bat 'mvn clean package'
                echo 'Build Maven terminé.'
            }
        }

        stage('Archive Artifacts') {
            steps {
                echo 'Archivage des artefacts...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
                echo 'Artefacts archivés.'
            }
        }
    }

    post {
        success {
            echo 'Build réussi !'
        }
        failure {
            echo 'Build échoué !'
        }
    }
}
