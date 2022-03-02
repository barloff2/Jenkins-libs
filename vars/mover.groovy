def clonandoProyecto(){
    ruta = "${workspace}/${BUILD_TAG}"
    powershell """
        echo 'creando carpeta'
        New-Item ${workspace}/${BUILD_TAG} -itemType Directory
        git clone -b test https://github.com/barloff2/jenkins.git ${workspace}

    """
}

def moverCarpeta(){

    powershell "Move-Item -Path ${workspace}/${BUILD_TAG} -Destination C:/destino"
}