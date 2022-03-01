String ruta = "C:/Users/Stiven/Documents/repo/desPrueba"
String destinoDir = "E:/pagina"
def crearDir(){
    bat "MD ${ruta} || true"
}


def clonar(){
    String clonar = "https://github.com/barloff2/jenkins.git"
    bat "git clone ${clonar} ${ruta}"
}

def mover(){
    bat "MD ${destinoDir} || true"
    bar "mv ${ruta} ${destinoDir}"
}