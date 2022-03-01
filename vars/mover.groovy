String ruta = "/home/stiven/Escritorio/prueba/intento"

def crearDir(def numero){
    ruta = "/home/stiven/Escritorio/prueba/intento${numero}"
    sh "mkdir ${ruta}"
}


def clonar(){
    String clonar = "https://github.com/barloff2/jenkins.git"
    String directorio = ruta
    sh "git clone ${clonar} ${directorio}"
}

def mover(def numero){
    String destinoDir = "/home/stiven/Documentos/pagina${numero}"
    sh "mkdir ${destinoDir} || true"
    sh "mv ${ruta} ${destinoDir}"
}