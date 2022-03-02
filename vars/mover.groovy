def crearDirectorio(){
    bat """
        IF EXIST C:/Users/Stiven/Documents/repo/${JOB_NAME}/ (echo la carpeta ya existe) 
        ELSE (MD C:/Users/Stiven/Documents/repo/${JOB_NAME})
    """
}