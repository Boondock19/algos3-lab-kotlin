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
  
   


}
