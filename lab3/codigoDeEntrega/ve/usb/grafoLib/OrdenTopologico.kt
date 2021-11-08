package ve.usb.grafoLib

/*
  Determina el orden topológico de un DAG
*/
public class OrdenTopologico(val g: GrafoDirigido) {
    var dfs = BusquedaEnProfundidad(g)
    var listaDeArcos = g.arcos()
    
    // Retorna true si el grafo g es un DAG, de lo contrario retorna false
    /*
     
     */
    fun esUnGrafoAciclicoDirecto() : Boolean {
      listaDeArcos.forEach{l ->
        var edge = dfs.edges(l)
        if (edge == "BACK") return false
      }
      return true
    }

    // Retorna el ordenamiento topológico del grafo g. Si el grafo G no es DAG,
    // entonces se lanza una RuntineException()
    fun obtenerOrdenTopologico() : Iterable<Int> {
      if (esUnGrafoAciclicoDirecto() == false) throw Exception("El grafo no es un DAG")
      return dfs.ordenTopologicoGrafo()
    }
}
