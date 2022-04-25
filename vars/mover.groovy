String destino = "C:\\destino\\${BUILD_TAG}\\"
def files
void clonandoProyecto(){
    git branch: 'main', url: 'https://github.com/barloff2/jenkins.git' 
}
void moverCarpeta(){
    powershell """
        echo 'Moviendo carpeta a destino'
        Move-Item -Path ${workspace}\\* -Destination C:\\destino\\${BUILD_TAG}\\
    """
}

void findFiles(){
    dir(destino){
        files = findFiles(glob: "**/*")
    }
    println files.length + ' Archivos encontrados'

    files.each{ file -> 
        if (file.name != '.jsp'){
            "Remove-item ${destino}"
        }
    }
}
