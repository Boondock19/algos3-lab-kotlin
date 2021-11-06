import ve.usb.grafoLib.*


fun main(args: Array<String>) {
    if (args.size !=2 ){
        throw Exception("INGRESE UN VALORES VALIDOS, PARA CONSTRUIR EL GRAFO, PUEDE SER n o d y debe agregar el nombre del archivo")
    }
    if (args[0] == null) {
        throw Exception("INGRESE UN VALOR VALIDO, PARA CONSTRUIR EL GRAFO, PUEDE SER n o d")
    }
    if (args[1] == null) {
        throw Exception("INGRESE UN VALORES VALIDOS, PARA CONSTRUIR EL GRAFO, PUEDE SER n o d y debe agregar el nombre del archivo")
    }
    var tipoGrafo = args[0]

    var nombreDelArchivo = args[1]

    if (tipoGrafo == "n") {
        var grafoNoDirigidoPrueba = GrafoNoDirigido(nombreDelArchivo,false)
        var listaDeAristas = grafoNoDirigidoPrueba.aristas()
        listaDeAristas.forEachIndexed{ index,arista ->
            var busquedaEnAmplitud1 = BusquedaEnAmplitud(grafoNoDirigidoPrueba,arista.first)
            var busquedaEnAmplitud2 = BusquedaEnAmplitud(grafoNoDirigidoPrueba,arista.second)
            if (busquedaEnAmplitud1.obtenerDistancia(arista.second) <= busquedaEnAmplitud2.obtenerDistancia(arista.first)){
                println("\n ${arista} :  distancia = ${busquedaEnAmplitud1.obtenerDistancia(arista.second)}  camino : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(arista.second)} \n")
            } else {
                println("\n ${arista} :  distancia = ${busquedaEnAmplitud2.obtenerDistancia(arista.first)}  camino : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(arista.first)} \n")
            }
         }
        

    } else if (tipoGrafo == "d") {
        var grafoDirigidoPrueba = GrafoDirigido(nombreDelArchivo,false)
        var listaDeArcos = grafoDirigidoPrueba.arcos()
        listaDeArcos.forEachIndexed{ index,arcos ->
            var busquedaEnAmplitud1 = BusquedaEnAmplitud(grafoDirigidoPrueba,arcos.first)
            var busquedaEnAmplitud2 = BusquedaEnAmplitud(grafoDirigidoPrueba,arcos.second)
            if (busquedaEnAmplitud1.obtenerDistancia(arcos.second) <= busquedaEnAmplitud2.obtenerDistancia(arcos.first)){
                println("\n ${arcos} :  distancia = ${busquedaEnAmplitud1.obtenerDistancia(arcos.second)}  camino : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(arcos.second)} \n")
            } else {
                println("\n ${arcos} :  distancia = ${busquedaEnAmplitud2.obtenerDistancia(arcos.first)}  camino : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(arcos.first)} \n")
            }
         }
        
    } 


    
    
  
   


}
