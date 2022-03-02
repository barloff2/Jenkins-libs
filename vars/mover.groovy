def crearDirectorio(){
    bat "IF EXIST C:/Users/Stiven/Documents/repo/${BUILD_TAG} (echo carpeta existente) ELSE (MD C:/Users/Stiven/Documents/repo/${BUILD_TAG})"
}