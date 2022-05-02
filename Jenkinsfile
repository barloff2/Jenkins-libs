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
                echo 'SQL0803N One or more values in the INSERT statement ... not valid because the primary key ... from having duplicate values for the index key. SQLSTATE=23505'
                script{
                    mover.data()
                }
            }
        }
    }
}