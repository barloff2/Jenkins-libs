
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
        if(directory != flagDirectory){
            println 'creando carpeta '+ directory
            bat "md ${destination}${directory}"
        }
        println 'copiando '+file.name
        bat "copy ${workspace}\\${file} ${destination}${file}"
    }

}