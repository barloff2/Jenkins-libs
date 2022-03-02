def crearDirectorio(){
    def crear = "MD C:/Users/Stiven/Documents/repo/${JOB_NAME}"
    bat """
        if EXIST C:/Users/Stiven/Documents/repo/${JOB_NAME} (echo La carpeta ya existe, Continuemos) ELSE (${crear})
    """
}