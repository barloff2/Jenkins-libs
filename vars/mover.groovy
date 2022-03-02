def crearDirectorio(){
    bat """
        if EXIST C:/Users/Stiven/Documents/repo/${JOB_NAME} (echo exite) ELSE (echo no existe)
    """
}