def crearDir(String nombreDir){
    def ruta = "home/stiven/Escritorio/prueba/${nombreDir}"
    sh "mkdir ${ruta}"
}


def clonar(){
    def clonar = "https://github.com/barloff2/jenkins.git"
    def directorio = "/home/stiven/Escritorio/prueba/pruebaCop"
    sh "git clone ${clonar} ${directorio}"
}

def mover(){
    def nuevoDir = "mkdir /home/stiven/Documentos/pagina"
    def copiar = "cp -r home/stiven/Escritorio/prueba/${nombreDir} /home/stiven/Documentos/pagina"
    sh ${nuevoDir}
    sh ${copiar}
}