import ve.usb.grafoLib.*


fun main(args: Array<String>) {

    for(str in args) {
        println("Hello ${str}")
    }
val arcoPrueba = Arco(4,5)

    println("Arco de prueba : ${arcoPrueba} \n")
    
    println("Procedemos con las pruebas de los metodos de arco: \n")
    println("Fuente del arco :\n") 
    println(arcoPrueba.fuente())
    println("Sumidero del arco: \n") 
    println(arcoPrueba.sumidero())
    println("peso del arco: \n")
    println(arcoPrueba.peso())
    println("Cualquiera de los dos vertices de la arista :\n") 
    println(arcoPrueba.cualquieraDeLosVertices())
    println("El otro vertice: \n") 
    println(arcoPrueba.elOtroVertice(4))
    println("arco to string:\n")
    println(arcoPrueba.toString())

    val aristaPrueba = Arista(4,5,5.0)
    val aristaPrueba2 = Arista(5,8,0.0)
    val aristaPrueba3 = Arista(5,8,0.0)


    println("Aristas de prueba : 1- ${aristaPrueba} , 2-{aristaPrueba2} y ${aristaPrueba3} \n")
    
    println("Procedemos con las pruebas de los metodos de arista: \n")
    println("Cualquiera de los dos vertices de la arista :\n") 
    println(aristaPrueba.cualquieraDeLosVertices())
    println("El otro vertice: \n") 
    println(aristaPrueba.elOtroVertice(4))
    println("peso del arco: \n")
    println(aristaPrueba.peso())
    println("arco to string:\n")
    println(aristaPrueba.toString())
    println("comperacion peso de arista 1 y 2: \n")
    println(aristaPrueba.compareTo(aristaPrueba2))
    println("comperacion peso de arista 2 y 3 : \n")
    println(aristaPrueba2.compareTo(aristaPrueba3))
    println("comperacion peso de arista 2 y 1 : \n")
    println(aristaPrueba2.compareTo(aristaPrueba))

    println("grafoDirigido Pruebas: \n")
    
    var grafoDirigidoPrueba = GrafoDirigido("mini.txt",false)
    
    
    println("numero de lados del grafoPrueba sin Peso : ${grafoDirigidoPrueba.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafoPrueba sin Peso : ${grafoDirigidoPrueba.obtenerNumeroDeVertices()}\n")
    println("Estos son los Arcos del grafo sin Peso : ${grafoDirigidoPrueba.arcos()}\n")
    println("Estos son los Arcos adyacentes del vertice del grafo sin Peso  : ${grafoDirigidoPrueba.adyacentes(2)}\n")
    println("Este es el metodo toString() del grafo sin Peso: ${grafoDirigidoPrueba.toString()}\n" )
    
    var grafoDirigidoPrueba3 = GrafoDirigido("miniPeso.txt",true)
    
   
    
    println("numero de lados del grafoPrueba con PESO : ${grafoDirigidoPrueba3.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafoPrueba con PESO : ${grafoDirigidoPrueba3.obtenerNumeroDeVertices()}\n")
    println("Estos son los Arcos del grafo con PESO : ${grafoDirigidoPrueba3.arcos()}\n")
    println("Estos son los Arcos adyacentes del vertice del grafo con PESO  : ${grafoDirigidoPrueba3.adyacentes(2)}\n")
    println("Este es el metodo toString() del grafo con PESO: ${grafoDirigidoPrueba3.toString()}\n" )
    
    var grafoDirigidoPrueba2 = GrafoDirigido(4)
    println("print del grafo dirigido creado un numero: \n")
    var arco1 = Arco(2,1)
    var arco2 = Arco(2,3)
    var arco3 = Arco(2,1)
    var arco4 = Arco(2,0)
    
    grafoDirigidoPrueba2.agregarArco(arco1)
    grafoDirigidoPrueba2.agregarArco(arco2)
    // grafoDirigidoPrueba2.agregarArco(arco3)
    grafoDirigidoPrueba2.agregarArco(arco4)
    
    println("numero de lados del grafo creado con un numero : ${grafoDirigidoPrueba2.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafo creado con un numero : ${grafoDirigidoPrueba2.obtenerNumeroDeVertices()}\n")
    println("Estos son los Arcos del grafo creado con un numero : ${grafoDirigidoPrueba2.arcos()}\n")
    println("Estos son los Arcos adyacentes del vertice (2) del grafo creado con un numero : ${grafoDirigidoPrueba2.adyacentes(2)}\n")
    println("Este es el grado exterior del vertice (2) del grafo creado con un numero : ${grafoDirigidoPrueba2.gradoExterior(2)}\n")
    println("Este es el grado interior del vertice (2) del grafo creado con un numero : ${grafoDirigidoPrueba2.gradoInterior(2)}\n")
    println("Este es el grado total del vertice (2) del grafo creado con un numero : ${grafoDirigidoPrueba2.grado(2)}\n")
    println("Estos son los Arcos adyacentes del vertice (1) del grafo creado con un numero : ${grafoDirigidoPrueba2.adyacentes(1)}\n")
    println("Este es el grado exterior del vertice (1) del grafo creado con un numero : ${grafoDirigidoPrueba2.gradoExterior(1)}\n")
    println("Este es el grado interior del vertice (1) del grafo creado con un numero : ${grafoDirigidoPrueba2.gradoInterior(1)}\n")
    println("Este es el grado total del vertice (1) del grafo creado con un numero : ${grafoDirigidoPrueba2.grado(1)}\n")
    println("Este es el grado total del vertice (3) del grafo creado con un numero : ${grafoDirigidoPrueba2.grado(3)}\n")

    println("Este es el metodo toString() del grafo del grafo creado con un numero : ${grafoDirigidoPrueba2.toString()}\n" )
    
  
        println("grafoNoDirigido Pruebas: \n")
    
    var grafoNoDirigidoPrueba = GrafoNoDirigido("mini.txt",false)
    
    
    println("numero de lados del grafoPrueba sin Peso : ${grafoNoDirigidoPrueba.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafoPrueba sin Peso : ${grafoNoDirigidoPrueba.obtenerNumeroDeVertices()}\n")
    println("Estos son los Aristas del grafo sin Peso : ${grafoNoDirigidoPrueba.aristas()}\n")
    println("Estos son los Aristas adyacentes del vertice del grafo sin Peso  : ${grafoNoDirigidoPrueba.adyacentes(2)}\n")
    println("Este es el metodo toString() del grafo sin Peso: ${grafoNoDirigidoPrueba.toString()}\n" )
    
    var grafoNoDirigidoPrueba3 = GrafoNoDirigido("miniPeso.txt",true)
    
   
    
    println("numero de lados del grafoPrueba con PESO : ${grafoNoDirigidoPrueba3.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafoPrueba con PESO : ${grafoNoDirigidoPrueba3.obtenerNumeroDeVertices()}\n")
    println("Estas son las Aristas del grafo con PESO : ${grafoNoDirigidoPrueba3.aristas()}\n")
    println("Estas son las Aristas adyacentes del vertice del grafo con PESO  : ${grafoNoDirigidoPrueba3.adyacentes(2)}\n")
    println("Este es el metodo toString() del grafo con PESO: ${grafoNoDirigidoPrueba3.toString()}\n" )
    
    var grafoNoDirigidoPrueba2 = GrafoNoDirigido(4)
    println("print del grafo no dirigido creado un numero: \n")
    var arista1 = Arista(2,1)
    var arista2 = Arista(2,3)
    var arista3 = Arista(2,1)
    var arista4 = Arista(2,0)
    
    grafoNoDirigidoPrueba2.agregarArista(arista1)
    grafoNoDirigidoPrueba2.agregarArista(arista2)
    grafoNoDirigidoPrueba2.agregarArista(arista3)
    grafoNoDirigidoPrueba2.agregarArista(arista4)
    
    println("numero de lados del grafo creado con un numero : ${grafoNoDirigidoPrueba2.obtenerNumeroDeLados()}\n")
    println("numero de vertices del grafo creado con un numero : ${grafoNoDirigidoPrueba2.obtenerNumeroDeVertices()}\n")
    println("Estos son las Aristas del grafo creado con un numero : ${grafoNoDirigidoPrueba2.aristas()}\n")
    println("Estas son las Aristas adyacentes del vertice (2) del grafo creado con un numero : ${grafoNoDirigidoPrueba2.adyacentes(2)}\n")
    println("Este es el grado del vertice (2) del grafo creado con un numero : ${grafoNoDirigidoPrueba2.grado(2)}\n")
    println("Estas son las Aristas adyacentes del vertice (1) del grafo creado con un numero : ${grafoNoDirigidoPrueba2.adyacentes(1)}\n")
    println("Este es el grado del vertice (1) del grafo creado con un numero : ${grafoNoDirigidoPrueba2.grado(1)}\n")

    println("Este es el metodo toString() del grafo del grafo creado con un numero : ${grafoNoDirigidoPrueba2.toString()}\n" )

    println("BusquedaEnAmplitud (BFS) Pruebas: \n")
    var busquedaEnAmplitud1 = BusquedaEnAmplitud(grafoDirigidoPrueba,2)
    println("Busquemos al predecesor de 1 : ${busquedaEnAmplitud1.obtenerPredecesor(1)}")
    println("Busquemos al predecesor de 0 : ${busquedaEnAmplitud1.obtenerPredecesor(0)}")
    println("Busquemos al predecesor de 7 : ${busquedaEnAmplitud1.obtenerPredecesor(7)}")
   // println("Busquemos al predecesor de 8 : ${busquedaEnAmplitud1.obtenerPredecesor(8)}")
    println("Busquemos la disntacia desde 2 a  1 : ${busquedaEnAmplitud1.obtenerDistancia(1)}")
    println("Busquemos la disntacia desde 2 a  0 : ${busquedaEnAmplitud1.obtenerDistancia(0)}")
    println("Busquemos la disntacia desde 2 a  7 : ${busquedaEnAmplitud1.obtenerDistancia(7)}")
    //println("Busquemos la disntacia desde 2 a  8  : ${busquedaEnAmplitud1.obtenerDistancia(8)}")
    println("Busquemos si existe un camino desde 2 a  1 : ${busquedaEnAmplitud1.hayCaminoHasta(1)}")
    println("Busquemos si existe un camino desde 2 a  0 : ${busquedaEnAmplitud1.hayCaminoHasta(0)}")
    println("Busquemos si existe un camino desde 2 a  7 : ${busquedaEnAmplitud1.hayCaminoHasta(7)}")
    //println("Busquemos si existe un camino desde 2 a  8 : ${busquedaEnAmplitud1.hayCaminoHasta(8)}")
    //println("Camino corto  desde 2 a  1 : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(1)}")
    println("Camino corto  desde 2 a  0 : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(0)}")
    println("Camino corto  desde 2 a  7 : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(7)}")
   // println("Camino corto  desde 2 a  8 : ${busquedaEnAmplitud1.caminoConMenosLadosHasta(8)}")
    
    println("BusquedaEnProfundidad (DFS) Pruebas: \n")
    var busquedaEnProfundidad1 = BusquedaEnProfundidad(grafoDirigidoPrueba)
    println("Busquemos al predecesor de 1 : ${busquedaEnProfundidad1.obtenerPredecesor(1)}")
    println("Busquemos al predecesor de 0 : ${busquedaEnProfundidad1.obtenerPredecesor(0)}")
    println("Busquemos al predecesor de 7 : ${busquedaEnProfundidad1.obtenerPredecesor(7)}")
    //println("Camino corto  desde 2 a  8 : ${busquedaEnProfundidad1.obtenerPredecesor(8)}")
    println("Busquemos los tiempos  de 1 : ${busquedaEnProfundidad1.obtenerTiempos(1)}")
    println("Busquemos los tiempos  de 0 : ${busquedaEnProfundidad1.obtenerTiempos(0)}")
    println("Busquemos los tiempos  de 7 : ${busquedaEnProfundidad1.obtenerTiempos(7)}")
    //println("Camino corto  desde 2 a  8 : ${busquedaEnProfundidad1.obtenerTiempos(8)}")
   


}
