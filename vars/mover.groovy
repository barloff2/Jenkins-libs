def crearDirectorio(){
    saludo = "hola"
    //powershell "New-Item C:/Users/Stiven/Documents/repo/${BUILD_TAG} -itemType Directory"
    bat "echo ${saludo}"
}

def clonandoProyecto(){
     //powershell "git clone -b test https://github.com/barloff2/jenkins.git C:/Users/Stiven/Documents/repo/${BUILD_TAG}"
}

def moverCarpeta(){
    //powershell "Move-Item -Path C:/Users/Stiven/Documents/repo/${BUILD_TAG} -Destination C:/destino"
}