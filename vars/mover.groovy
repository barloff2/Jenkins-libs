def clonandoProyecto(){
     powershell "git clone -b test https://github.com/barloff2/jenkins.git ${workspace}"
}

def moverCarpeta(){
    powershell "Move-Item -Path ${workspace} -Destination C:/destino"
}