def clonandoProyecto(){
    rutaClon = "${workspace}/${BUILD_TAG}"
    powershell"""
        echo 'creando carpeta para guardar los archivos...'
        New-Item ${rutaClon} -itemType Directory
        git clone -b test https://github.com/barloff2/jenkins.git ${ruta}

    """
}
def moverCarpeta(){
    powershell """
        echo 'Moviendo carpeta a destino'
        Move-Item -Path ${rutaClon} -Destination C:/destino
    """
}