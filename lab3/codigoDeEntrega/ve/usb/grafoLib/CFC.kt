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
    var numVertices = g.obtenerNumeroDeVertices()
    var listaDeVertices = mutableListOf<Int>()
    
  init {
    for (i in 0..this.numVertices-1){
      this.listaDeVertices.add(i)
    }
    this.listaArcos.forEach{ a ->
      var edge = dfsInverso.edges(a)
      var listaCFCTemp = mutableSetOf<Int>()
      if (edge == "BACK") {
        var ladoFuente = a.fuente()
        var ladoSumidero = a.sumidero()
        listaCFCTemp.add(ladoFuente)
        while (dfsInverso.obtenerPredecesor(ladoFuente) != null  && dfsInverso.obtenerPredecesor(ladoFuente) as Int != ladoSumidero ){
            ladoFuente = dfsInverso.obtenerPredecesor(ladoFuente) as Int
            listaCFCTemp.add(ladoFuente)
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
      var conectados = false
      if (v in this.listaDeVertices && u in this.listaDeVertices){
        if (this.obtenerIdentificadorCFC(v) != this.obtenerIdentificadorCFC(u)){
          this.listaCFC.forEach{c->
            c.forEach{vertice->
              println("Este es el vertice del forEach de la componente $c , vertice $vertice \n")
              var adyacentes = g.adyacentes(vertice)
              adyacentes.forEach{a ->
                if(v == a.segundoV && u == a.primerV){
                  conectados = true
                }
                 if(u == a.segundoV && v == a.primerV){
                  conectados = true
                }
              }
               println("Lista de adyacencias  , $adyacentes \n")
              println("conectado dps de cada iteracion $conectados")
            }
          }
        }
      } else {
        throw Exception("El vertice $v o $u no pertenecen al grafo")
      }
      
      return conectados
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
     
    fun obtenerIdentificadorCFC(v: Int) : Int {
      var indentificador = 0
      if (v in this.listaDeVertices) {
        this.listaCFC.forEachIndexed{index,c ->
          if(c.contains(v)) {
            indentificador = index
            }
        }
      } else {
        throw Exception("El vertice $v no se encuentra en el grafo")
      }

      return indentificador 
    }
    

  
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
    fun obtenerGrafoComponente() : GrafoDirigido {
      var numVerticesConexos = this.numeroDeCFC()
      var grafoConexo = GrafoDirigido(numVerticesConexos)
      return grafoConexo
    }

}
