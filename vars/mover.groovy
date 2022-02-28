String ruta = "/home/stiven/Escritorio/prueba/intento"
String numeroPrueba = ${BUILD_NUMBER}

def crearDir(){
    ruta = "/home/stiven/Escritorio/prueba/intento${numeroPrueba}"
    sh "mkdir ${ruta}"
}


def clonar(){
    def clonar = "https://github.com/barloff2/jenkins.git"
    def directorio = ${ruta}
    sh "git clone ${clonar} ${directorio}"
}

def mover(){
    def destinoDir = "/home/stiven/Documentos/pagina"
    sh "mkdir ${destinoDir}"
    sh "cp -r ${origenDir} ${ruta}"
}