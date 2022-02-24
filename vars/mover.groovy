import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import jenkins.model.Jenkins
import hudson.util.RemotingDiagnostics

def moverArchivo(){
    Path origenPath = FileSystems.default.getPath("/home/stiven/Escritorio/prueba/jenkins/archivo1.txt")
    Path destinoPath = FileSystems.default.getPath("/home/stiven/Escritorio/archivo1.txt")
    
    try {
       Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING)
       echo 'moviendo archivo'
    }catch (IOException e) {
        echo e.message
    }
}