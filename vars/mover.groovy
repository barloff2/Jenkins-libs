import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

def moverArchivo(){
    ssh Path origenPath = FileSystems.default.getPath("/home/stiven/Escritorio/prueba/jenkins/archivo1.txt")
    ssh Path destinoPath = FileSystems.default.getPath("/home/stiven/Escritorio/archivo1.txt")
    
    try {
       ssh Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING)
       ssh echo 'moviendo archivo'
    }catch (IOException e) {
        ssh echo e.message
    }
}