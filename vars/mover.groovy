
def crearDirectorio(){
    powershell "New-Item C:/Users/Stiven/Documents/repo/prueba -itemType Directory"
}

def clonandoProyecto(){
     powershell "git branch: test, url: https://github.com/barloff2/jenkins.git"
}