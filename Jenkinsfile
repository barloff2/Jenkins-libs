@Library('jenkinsLibs') _
pipeline {
    agent any
    stages {
        stage('crear'){
            steps{
                script{
                    mover.crearDirectorio()
                    echo 'termino creacion carpetas'
                }
            }
        }
        stage('clonar'){
            steps{
                script{
                    mover.clonandoProyecto()
                    echo 'termino clonacion'
                } 
            }
        }
        stage('mover'){
            steps{
                script{
                    mover.moverCarpeta()
                    echo 'moviendo carpeta'
                }
            }
        }
    }
}