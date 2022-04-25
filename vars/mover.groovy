
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
    def destination = "C:\\Users\\Stiven\\Documents\\prueba\\"
    dir("C:\\destino\\${BUILD_TAG}\\"){
        files = findFiles(glob: "**/*")
    }
    println files.length + ' Archivos encontrados'
    files.each{ file ->
        def flagDirectory = directory
        directory = file.path.replaceFirst(/${file.name}/, "")
        if(directory != flagDirectory){
            powershell "New-Item ${destination}${directory} -Type Directory"
        }
        if (file.path.matches(/.*\.js/)){
            println 'copiando '+file.name
            powershell "Copy-Item C:\\destino\\${BUILD_TAG}\\${file} -Destination ${destination}${file}"
        }
    }

}
