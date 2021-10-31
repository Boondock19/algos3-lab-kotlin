package ve.usb.grafoLib

import java.util.LinkedList

/* 
   Implementación del algoritmo DFS. 
   Con la creación de la instancia, se ejecuta el algoritmo DFS
   desde todos los vértices del grafo
*/
public class BusquedaEnProfundidad(val g: Grafo) {
    
    init {
	// Se ejecuta DFS
    }

    private fun dfsVisit(g: Grafo, u: Int) {

    }

    /*
     Retorna el predecesor de un vértice v. Si el vértice no tiene predecesor 
     se retorna null. En caso de que el vértice v no exista en el grafo se lanza
     una RuntimeException 
     */    
    fun obtenerPredecesor(v: Int) : Int? { }

     /*
     Retorna un par con el tiempo inical y final de un vértice durante la ejecución de DFS. 
      En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */
    fun obtenerTiempos(v: Int) : Pair<Int, Int> {  }
}
