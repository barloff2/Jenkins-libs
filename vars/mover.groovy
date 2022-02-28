def clonar(){
    def clonar = "git branch: 'main', url: 'https://github.com/barloff2/jenkins.git'"
    def directorio = "/home/stiven/Escritorio/prueba/pruebaCop"
    sh ${clonar} ${directorio}
}

def mover(){
    def nuevoDir = "mkdir /home/stiven/Documentos/pagina"
    def copiar = "cp -r home/stiven/Escritorio/prueba/pruebaCop /home/stiven/Documentos/pagina"
    sh ${nuevoDir}
    sh ${copiar}
}