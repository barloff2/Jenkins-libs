def crearDirectorio(){
    bat """
        if EXIST C:/Users/Stiven/Documents/repo/${JOB_NAME} (echo La carpeta ya existe) ELSE (MD C:/Users/Stiven/Documents/repo/${JOB_NAME})
    """
}