def clonandoProyecto(){
    ruta = "${workspace}/${BUILD_TAG}"
    powershell """
        echo 'creando carpeta'
        New-Item ${ruta} -itemType Directory
        git clone -b test https://github.com/barloff2/jenkins.git ${ruta}

    """
}

def moverCarpeta(){

    powershell "Move-Item -Path ${ruta} -Destination C:/destino"
}