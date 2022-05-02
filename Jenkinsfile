@Library('jenkinsLibs') _
pipeline {
    agent any
    stages {
        stage('clonar'){
            steps{
                script{
                   mover.clonandoProyecto()
                }
            }
        }
        stage('mover'){
            steps{
                script{
                    //mover.moverCarpeta()
                    //mover.findFiles()
                    dashboardDb2()
                }
            }
        }
    }
}