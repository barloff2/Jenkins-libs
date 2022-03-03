def saludo ="hola"

def clonandoProyecto(){
    ruta = "${workspace}/${BUILD_TAG}"
    /*powershell"""
        echo 'creando carpeta para guardar los archivos...'
        New-Item ${ruta} -itemType Directory
    """*/
    git branch: 'testVar', url: 'https://github.com/barloff2/jenkins.git' 
}
def moverCarpeta(){
    powershell """
        echo 'Moviendo carpeta a destino'
        Move-Item -Path ${workspace}/* -Destination C:/destino/${BUILD_TAG}/
    """
}