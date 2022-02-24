import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

def moverArchivo(){
    sh Path origenPath = FileSystems.default.getPath("/home/stiven/Escritorio/prueba/jenkins/archivo1.txt")
    sh Path destinoPath = FileSystems.default.getPath("/home/stiven/Escritorio/archivo1.txt")
    
    try {
       sh Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING)
       sh echo 'moviendo archivo'
    }catch (IOException e) {
        echo e.message
    }
}