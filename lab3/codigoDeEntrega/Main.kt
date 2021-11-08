import ve.usb.grafoLib.*


fun main(args: Array<String>) {
   println("Prueba de la metodos de  un grafo no dirigido : \n")
     var grafoNoDirigidoPrueba = GrafoNoDirigido("mini.txt",false)
  


     
    println("Prueba de la metodos de  un grafo no dirigido : \n")
    var grafoDirigidoPrueba = GrafoDirigido("mini.txt",false)
    println("numero de lados del grafoPrueba sin Peso : ${grafoDirigidoPrueba.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafoPrueba sin Peso : ${grafoDirigidoPrueba.obtenerNumeroDeVertices()}\n")
    println("Estos son los Arcos del grafo sin Peso : ${grafoDirigidoPrueba.arcos()}\n")
    println("Estos son los Arcos adyacentes del vertice del grafo sin Peso  : ${grafoDirigidoPrueba.adyacentes(2)}\n")
    println("Este es el metodo toString() del grafo sin Peso: ${grafoDirigidoPrueba.toString()}\n" )
    var grafoDirigidoInversoPrueba = digrafoInverso(grafoDirigidoPrueba)
    println("numero de lados del grafoPrueba sin Peso : ${grafoDirigidoInversoPrueba.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafoPrueba sin Peso : ${grafoDirigidoInversoPrueba.obtenerNumeroDeVertices()}\n")
    println("Estos son los Arcos del grafo sin Peso : ${grafoDirigidoInversoPrueba.arcos()}\n")
    println("Estos son los Arcos adyacentes del vertice del grafo sin Peso  : ${grafoDirigidoInversoPrueba.adyacentes(2)}\n")
    println("Este es el metodo toString() del grafo sin Peso: ${grafoDirigidoInversoPrueba.toString()}\n" )
    println("Prueba de OrdenamientoTopologico : \n")
   // var grafoDirigidoOrdenTopologicoPrueba = OrdenTopologico(grafoDirigidoPrueba)
    var grafoDirigidoPrueba2 = GrafoDirigido("dag.txt",false)
    var grafoDirigidoOrdenTopologicoPrueba = OrdenTopologico(grafoDirigidoPrueba2)
    println("Tiene ciclos ?? : ${grafoDirigidoOrdenTopologicoPrueba.esUnGrafoAciclicoDirecto()}\n")
    println("Obtener orden Topologico : ${grafoDirigidoOrdenTopologicoPrueba.obtenerOrdenTopologico()}\n")
   println("Prueba de CICLODIGRAFO : \n")
   var grafoDirigidoPrueba3 = GrafoDirigido("arcoCiclo.txt",false)
   var grafoDirigidoCicloDigrafo = CicloDigrafo(grafoDirigidoPrueba3)
    println("Tiene ciclos ?? : ${grafoDirigidoCicloDigrafo.existeUnCiclo()}\n")
    println("Obtener el camino del ciclo : ${grafoDirigidoCicloDigrafo.cicloEncontrado()}\n")
    println("Prueba de CFC : \n")
    var grafoCFC = CFC(grafoDirigidoPrueba3)
    println("Tiene ciclos ?? : ${grafoCFC.estanFuertementeConectados(1,2)}\n")
    println("Obtener La lista CFC del grafo : ${grafoCFC.obternerCFC()}\n")
    println("Obtener la cantidad de componentes fuertemente Conexas : ${grafoCFC.numeroDeCFC()}\n")
    
  
   


}
