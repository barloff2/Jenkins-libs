println 'SQL0803N One or more values in the INSERT statement ... not valid because the primary key ... from having duplicate values for the index key. SQLSTATE=23505'
def data = currentBuld.rawBuild.getLog(100).join('\n')
searchOnLog(data, 'warning', [
    'SQL0803N one or more values in the INSERT statement'
])

void searchOnLog(data, searches){
    searches.each{key, search ->
        info = getSimpleRegex(data, "(${search}.*)")
        if (info){
            println "El error es: ${search} ojo cabeza"
        }
    }
}