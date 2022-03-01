String ruta = "/c/Users/Stiven/documents/repo/despliguePrueba"

def crearDir(){
    ruta = "/home/stiven/Escritorio/prueba/intento"
    sh "mkdir ${ruta} || true"
}


def clonar(){
    String clonar = "https://github.com/barloff2/jenkins.git"
    sh "git clone ${clonar} ${ruta}"
}

def mover(){
    String destinoDir = "/e/pagina"
    sh "mkdir ${destinoDir} || true"
    sh "mv ${ruta} ${destinoDir}"
}