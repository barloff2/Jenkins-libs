def crearDir(String nombreDir){
    def ruta = "/home/stiven/Escritorio/prueba/intento${nombreDir}"
    sh "mkdir ${ruta}"
}


def clonar(){
    def clonar = "https://github.com/barloff2/jenkins.git"
    def directorio = "/home/stiven/Escritorio/prueba/pruebaCop"
    sh "git clone ${clonar} ${directorio}"
}

def mover(){
    def destinoDir = "/home/stiven/Documentos/pagina"
    def origenDir = "home/stiven/Escritorio/prueba/intento${nombreDir}/"
    sh "mkdir ${destinoDir}"
    sh "cp -r ${origenDir} ${destinoDir}"
}