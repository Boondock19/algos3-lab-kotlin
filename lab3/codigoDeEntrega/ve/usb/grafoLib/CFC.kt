package ve.usb.grafoLib

/*
  Determina las componentes fuertementes conexas de un grafo 
  La componentes fuertementes conexas se determinan cuando 
  se crea un nuevo objeto de esta clase.
*/
public class CFC(val g: GrafoDirigido) {
    var dfs = BusquedaEnProfundidad(g)
    var ordenTopologico = dfs.ordenTopologicoGrafo().toMutableList()
    var grafoInverso = digrafoInverso(g)
    var dfsInverso = BusquedaEnProfundidad(grafoInverso,ordenTopologico)
    var listaCFC :MutableList<MutableSet<Int>> = mutableListOf()
    var listaArcos = grafoInverso.arcos()
    
  init {
    this.listaArcos.forEach{ a ->
      var edge = dfsInverso.edges(a)
      var listaCFCTemp = mutableSetOf<Int>()
      if (edge == "BACK") {
        var ladoFuente = a.fuente()
        var ladoSumidero = a.sumidero()
        listaCFCTemp.add(ladoFuente)
        while (dfsInverso.obtenerPredecesor(ladoFuente) != null  && dfsInverso.obtenerPredecesor(ladoFuente) as Int != ladoSumidero ){
            println("Iteracion dentro del while ladoFuente antes de cambiar :  $ladoFuente \n")
            ladoFuente = dfsInverso.obtenerPredecesor(ladoFuente) as Int
            println("Iteracion dentro del while  Predecesor ladoFuente  :  $ladoFuente \n")
            listaCFCTemp.add(ladoFuente)
            println("Iteracion dentro del while listaCFCTemp :  $listaCFCTemp \n")
          }
        listaCFCTemp.add(ladoSumidero)
        this.listaCFC.add(listaCFCTemp)
        }
      }
    }
    
    /*
     Retorna true si dos componentes están fuertemente conectados y
     falso en caso contrario. Si el algunos de los dos vértices de
     entrada, no pertenece al grafo, entonces se lanza un RuntineException
     */
    fun estanFuertementeConectados(v: Int, u: Int) : Boolean {
      println("Este es el orden topologico de dfs : $ordenTopologico \n")
      println("Este es el grafo de dfs : $g \n")
      println("Este es el grafo inverso de dfs : $grafoInverso \n")
      println("ESTA ES LA LISTA DE LAS CFC : $listaCFC")
      return false
    }

    // Indica el número de componentes fuertemente conexas
    fun numeroDeCFC() : Int {
      return this.listaCFC.size
    }

    /*
     Retorna el identificador de la componente fuertemente conexa donde está contenido 
     el vértice v. El identificador es un número en el intervalo [0 , numeroDeCFC()-1].
     Si el vértice v no pertenece al grafo g se lanza una RuntimeException
     */
    /* 
    fun obtenerIdentificadorCFC(v: Int) : Int {
	
    }
    
  */
  
    fun  obternerCFC() : Iterable<MutableSet<Int>> {
      return  this.listaCFC.asIterable()
    }
  
    /*
     Retorna el grafo componente asociado a las componentes fuertemente conexas. 
     El identificado de los vértices del grafo componente está asociado con los indicados en 
     la función obtenerCFC. Es decir, si por ejemplo si los vértices 5,6 y 8 de g pertenecen a la
     componentemente fuertemente conexa cero, entonces 
     obtenerIdentificadorCFC(5) = obtenerIdentificadorCFC(6) = obtenerIdentificadorCFC(8) = 0
     y se va a tener que el en grafo componente el vértice 0 representa a la componente conexa que
     contiene a los vértices 5,6 y 8 de g
     */
   // fun obtenerGrafoComponente() : GrafoNoDirigido {}

}
