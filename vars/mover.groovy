def crearDirectorio(){
    bat """
        IF exist "C:/Users/Stiven/Documents/repo/${JOB_NAME}/" (echo la carpeta ya existe) ELSE (MD C:/Users/Stiven/Documents/repo/${JOB_NAME})
    """
}