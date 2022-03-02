
def crearDirectorio(){
    powershell "New-Item C:/destino -itemType Directory"
    powershell "New-Item C:/Users/Stiven/Documents/repo/prueba -itemType Directory"
}

def clonandoProyecto(){
     powershell "git clone -b test https://github.com/barloff2/jenkins.git C:/Users/Stiven/Documents/repo/prueba"
}

def moverCarpeta(){
    powershell "Move-Item -Path C:/Users/Stiven/Documents/repo/prueba -Destination C:/destino"
}