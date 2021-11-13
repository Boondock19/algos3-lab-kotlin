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

}
