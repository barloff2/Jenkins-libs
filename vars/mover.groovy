class Clonacion{

    def rutaClonacion = "C:/Users/Stiven/Documents/repo/${BUILD_TAG}"
    def rutaDestino = "C:/destino"

    def crearDirectorio(){
        powershell "New-Item C:/destino -itemType Directory"
        powershell "New-Item ${rutaClonacion} -itemType Directory"
    }

    def clonandoProyecto(){
        powershell "git clone -b test https://github.com/barloff2/jenkins.git ${rutaClonacion}"
    }

    def moverCarpeta(){
        powershell "Move-Item -Path ${rutaClonacion} -Destination ${rutaDestino}"
    }

}

