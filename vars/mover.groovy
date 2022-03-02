def crearDirectorio(){
    bat """
        MD C:/Users/Stiven/Documents/repo/${JOB_NAME} || true
    """
}