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
    def directory
    dir("C:\\destino\\${BUILD_TAG}\\"){
        files = findFiles(glob: "**/*")
    }
    println files.length + ' Archivos encontrados'
    files.each{ file -> 
        println 'Imprimiendo .Directory ' + file.directory
        println 'Imprimiendo .path ' + file.path
        println 'Imprimiendo .name ' + file.name
        println 'Imprimiendo file ' + file
        String name = file.name
        directory = file.replace(name, "")
        println 'Imprimiendo Directorio' + directory
        if (!file.path.matches(/.*\.js/)){
            println 'Eliminando '+file.name
            powershell "Remove-Item C:\\destino\\${BUILD_TAG}\\${file}"
        }
    }

}
