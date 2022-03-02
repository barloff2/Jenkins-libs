
def crearDirectorio(){
    bat "MD C:/Users/Stiven/Documents/repo/${JOB_NAME}"
}

def clonandoProyecto(){
     "git branch: 'test', url: 'https://github.com/barloff2/jenkins.git'"
}