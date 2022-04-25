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
    def files
    dir("C:\\destino\\${BUILD_TAG}\\"){
        files = findFiles(glob: "**/*")
    }
    println files.length + ' Archivos encontrados'
    String regex = "**/*.jsp"
    files.each{ file -> 
        if (!file.path.matches(regex)){
            "Remove-item ${file}"
        }
    }
}
