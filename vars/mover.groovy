def crearDirectorio(){
    def exite = false
    bat """
        if EXIST C:/Users/Stiven/Documents/repo/${JOB_NAME} (${!existe})
        echo ${exite}
    """
}