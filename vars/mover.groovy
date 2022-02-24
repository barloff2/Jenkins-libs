import java.io.IOException
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
package org.foo

def moverArchivo(){
    shh Path origenPath = FileSystems.default.getPath("/home/stiven/Escritorio/prueba/jenkins/archivo1.txt")
    shh Path destinoPath = FileSystems.default.getPath("/home/stiven/Escritorio/archivo1.txt")
    
    try {
       shh Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING)
       shh echo 'moviendo archivo'
    }catch (IOException e) {
        shh echo e.message
    }
}