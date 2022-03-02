
def crearDirectorio(){
    powershell "New-Item C:/Users/Stiven/Documents/repo/prueba -itemType Directory"
}

def clonandoProyecto(){
     powershell "git clone -b test https://github.com/barloff2/jenkins.git C:/Users/Stiven/Documents/repo/prueba"
}