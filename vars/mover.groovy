
def crearDirectorio(){
    powershell "New-Item C:/Users/Stiven/Documents/repo/prueba -itemType Directory"
}

def clonandoProyecto(){
     git "git branch: 'test', url: 'https://github.com/barloff2/jenkins.git'"
}