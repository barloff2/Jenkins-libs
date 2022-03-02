String rutaClon = "C:/Users/Stiven/Documents/repo/${JOB_NAME}"

def crearDirectorio(){
    bat """
        MD ${rutaClon} || true
    """
}