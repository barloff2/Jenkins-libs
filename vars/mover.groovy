def crearDirectorio(){
    bat "IF EXIST C:/Users/Stiven/Documents/repo/${JOB_NAME} (echo carpeta existente) ELSE (MD C:/Users/Stiven/Documents/repo/${JOB_NAME})"
}