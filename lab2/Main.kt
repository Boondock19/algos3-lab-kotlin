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

    var listaVertices = mutableListOf<Int>()
    var vertices = mutableListOf<Int>()
    if (tipoGrafo == "n") {
        var grafoNoDirigidoPrueba = GrafoNoDirigido(nombreDelArchivo,false)
        var numVertices = grafoNoDirigidoPrueba.obtenerNumeroDeVertices()
         for (i in 0..numVertices-1) {
             listaVertices.add(i,i)
             vertices.add(i,i)
         }
        var listaDeAristas = grafoNoDirigidoPrueba.aristas()
        
        listaDeAristas.forEach { a -> 
        val DFS = BusquedaEnProfundidad(G)
        println("tipo de lado $a: " + DFS.tipodeLado(a))
    }
         /* */
         listaVertices.forEachIndexed{ index,v ->
            var busquedaEnAmplitud1 = BusquedaEnAmplitud(grafoNoDirigidoPrueba,v)
                var caminos = Array(numVertices){mutableListOf<Int>()}
                //var caminos = vertices.toList().map{ busquedaEnAmplitud1.caminoConMenosLadosHasta(it) }
                vertices.forEachIndexed{index,v ->
                    caminos.set(index,busquedaEnAmplitud1.caminoConMenosLadosHasta(v).toMutableList())
                }
                println("esta es la var CAMINOS ${caminos}")
              /*   
                if (busquedaEnAmplitud1.obtenerPredecesor(v) == null){
                    println("El vertice $v no tiene predecesores")
                } else {
                    caminos.forEach { camino -> 
                        if (camino.toList().size > 0 ){
                        val u = camino.last() 
                        println("camino hasta $u: $camino")
                        }   
                    }
                    //var distancia = busquedaEnAmplitud1.obtenerDistancia()
                }
              */     
                   if (grafoNoDirigidoPrueba is GrafoNoDirigido) listaVertices.remove(v) 

        }
    } else if (tipoGrafo == "d") {
        var grafoDirigidoPrueba = GrafoDirigido(nombreDelArchivo,false)
        var listaDeArcos = grafoDirigidoPrueba.arcos()
        var numVertices = grafoDirigidoPrueba.obtenerNumeroDeVertices()
        var vertices = listOf(0..numVertices-1)
        println("lista de vertices: ${vertices}")
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
