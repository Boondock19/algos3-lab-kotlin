import ve.usb.grafoLib.*


fun main(args: Array<String>) {
   println("Prueba de la metodos de  un grafo no dirigido : \n")
     var grafoNoDirigidoPruebaPequenio = GrafoNoDirigido("./grafosComponentesConexas/pequenio.txt",false)
    println("Este es el grafo no dirigido de prueba :  ${grafoNoDirigidoPruebaPequenio}  \n")
    //var conexasDFS = BusquedaEnProfundidad(grafoNoDirigidoPruebaPequenio)
    var dsfConexas = ComponentesConexasDFS(grafoNoDirigidoPruebaPequenio)
    println("Estan 0 y 5 en la misma componente Conexa?? :  ${dsfConexas.estanMismaComponente(12,10)}  \n")
    println("Cantidad de componentes Conexas :  ${dsfConexas.numeroDeComponentesConexas()}  \n")
    println("Obtener indentificador de la componente conexa, que posee al vertice 8 :  ${dsfConexas.obtenerComponente(12)}  \n")
    println("Vertices que componente a la componentes conexa de identificador 1 :  ${dsfConexas.numVerticesDeLaComponente(2)}  \n")
    println("PRUEBAS DE CONJUSTOS DISJUNTOS :    \n")
    var conjuntosDisjuntosPrueba = ConjuntosDisjuntos(10)
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(1,3)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(4,6)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(0,2)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(7,8)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(0,1)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(4,5)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(1,2)}")
    println("Prueba de union de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.union(1,6)}")
    println("Prueba de encontrar conjunto 6 de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.encontrarConjunto(6)}")
    println("Prueba de encontrar conjunto 8 de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.encontrarConjunto(8)}")
    println("Prueba de encontrar conjunto 9 de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.encontrarConjunto(9)}")
    println("Prueba de numero de conjuntos de conjuntosDisjuntos : ${conjuntosDisjuntosPrueba.numConjuntosDisjuntos()}")
    var cojuntosDisjuntos = ComponentesConexasCD(grafoNoDirigidoPruebaPequenio)
    println("PRUEBAS DE COMPONENTES CONEXAS CD :    \n")
    println("Estan 0 y 5 en la misma componente Conexa?? :  ${cojuntosDisjuntos.estanMismaComponente(7,2)}  \n")
    println("Cantidad de componentes Conexas :  ${cojuntosDisjuntos.numeroDeComponentesConexas()}  \n")
    println("Obtener indentificador de la componente conexa, que posee al vertice 8 :  ${cojuntosDisjuntos.obtenerComponente(2)}  \n")
    println("Vertices que componente a la componentes conexa de identificador 2 :  ${cojuntosDisjuntos.numVerticesDeLaComponente(0)}  \n")
    

    // GRAFO MEDIANO
  /* 
    println("Prueba de la metodos de  un grafo no dirigido MEDIANO: \n")
     var grafoNoDirigidoPruebaMediano = GrafoNoDirigido("./grafosComponentesConexas/mediano.txt",false)
    println("Este es el grafo no dirigido de prueba :  ${grafoNoDirigidoPruebaMediano}  \n")
    //var conexasDFS = BusquedaEnProfundidad(grafoNoDirigidoPruebaMediano)
    var dsfConexasMedianas = ComponentesConexasDFS(grafoNoDirigidoPruebaMediano)
    println("Estan 0 y 5 en la misma componente Conexa?? :  ${dsfConexasMedianas.estanMismaComponente(12,10)}  \n")
    println("Cantidad de componentes Conexas :  ${dsfConexasMedianas.numeroDeComponentesConexas()}  \n")
    println("Obtener indentificador de la componente conexa, que posee al vertice 8 :  ${dsfConexasMedianas.obtenerComponente(12)}  \n")
    println("Vertices que componente a la componentes conexa de identificador 1 :  ${dsfConexasMedianas.numVerticesDeLaComponente(0)}  \n")
    println("PRUEBAS DE CONJUSTOS DISJUNTOS :    \n")
    var cojuntosDisjuntosMedianas = ComponentesConexasCD(grafoNoDirigidoPruebaMediano)
    println("PRUEBAS DE COMPONENTES CONEXAS CD :    \n")
    println("Estan 0 y 5 en la misma componente Conexa?? :  ${cojuntosDisjuntosMedianas.estanMismaComponente(7,2)}  \n")
    println("Cantidad de componentes Conexas :  ${cojuntosDisjuntosMedianas.numeroDeComponentesConexas()}  \n")
    println("Obtener indentificador de la componente conexa, que posee al vertice 8 :  ${cojuntosDisjuntosMedianas.obtenerComponente(2)}  \n")
    println("Vertices que componente a la componentes conexa de identificador 2 :  ${cojuntosDisjuntosMedianas.numVerticesDeLaComponente(0)}  \n")
  */
  // PRUEBAS DE ARBOL MIN COBERTOR KRUSBAL 

   println("Prueba de la metodos de  un grafo no dirigido con peso PEQUENIO: \n")
   var grafoNoDirigidoPruebaPequenioPeso = GrafoNoDirigido("./grafosAMC/gnd-pequenio.txt",true)
   var arbolMinCobertorKruskalPequenio = ArbolMinimoCobertorKruskal(grafoNoDirigidoPruebaPequenioPeso)
   println("Arbol min cobertor kruskal :  ${arbolMinCobertorKruskalPequenio.obtenerLados()}  \n")
   println("PESO Arbol min cobertor kruskal :  ${arbolMinCobertorKruskalPequenio.obtenerPeso()}  \n")  

}
