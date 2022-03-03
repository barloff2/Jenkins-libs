def saludo ="hola"

def clonandoProyecto(){
    ruta = "${workspace}/${BUILD_TAG}"
    powershell"""
        echo 'creando carpeta para guardar los archivos...'
        New-Item ${ruta} -itemType Directory
        git clone -b test https://github.com/barloff2/jenkins.git ${ruta}

    """
}
def moverCarpeta(){
    powershell """
        echo 'Moviendo carpeta a destino'
        Move-Item -Path ${ruta} -Destination C:/destino
    """
}