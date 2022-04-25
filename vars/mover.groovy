
void clonandoProyecto(){
    git branch: 'prue', url: 'https://github.com/barloff2/jenkins.git' 
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
    def destination = "C:\\Users\\Stiven\\Documents\\prueba\\"
    dir(workspace){
        files = findFiles(glob: "**/*.js")
    }
    println files.length + ' Archivos encontrados'
    files.each{ file ->
        def flagDirectory = directory
        directory = file.path.replaceFirst(/${file.name}/, "")
        println directory
        if(directory != flagDirectory){
            cmd "md ${destination}${directory}"
        }
        println 'copiando '+file.name
        cmd "copy ${workspace}\\${file} ${destination}${file}"
    }

}
