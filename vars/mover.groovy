
def crearDirectorio(){
    bat "MD C:/Users/Stiven/Documents/repo/${BUILD_TAG}"
}

def clonandoProyecto(){
     "git branch: 'test', url: 'https://github.com/barloff2/jenkins.git'"
}