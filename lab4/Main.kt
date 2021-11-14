import ve.usb.grafoLib.*


fun main(args: Array<String>) {
   println("Prueba de la metodos de  un grafo no dirigido : \n")
     var grafoNoDirigidoPrueba = GrafoNoDirigido("./grafosComponentesConexas/pequenio.txt",false)
    println("Este es el grafo no dirigido de prueba :  ${grafoNoDirigidoPrueba}  \n")
    //var conexasDFS = BusquedaEnProfundidad(grafoNoDirigidoPrueba)
    var dsfConexas = ComponentesConexasDFS(grafoNoDirigidoPrueba)
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


}
