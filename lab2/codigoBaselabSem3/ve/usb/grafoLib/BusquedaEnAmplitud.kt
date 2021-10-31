package ve.usb.grafoLib

import java.util.LinkedList

/* 
   Implementación del algoritmo BFS. 
   Con la creación de la instancia, se ejecuta el algoritmo BFS
   desde el vértice s
*/
public class BusquedaEnAmplitud(val g: Grafo, val s: Int) {
    
    init {
	// Se ejecuta BFS
    }

    /*
     Retorna el predecesor de un vértice v. Si el vértice no tiene predecesor 
     se retorna null. En caso de que el vértice v no exista en el grafo se lanza
     una RuntimeException 
     */
    fun obtenerPredecesor(v: Int) : Int? {  }

    /*
     Retorna la distancia, del camino con menos lados, desde el vértice inicial s 
     hasta el un vértice v. 
     En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */
    fun obtenerDistancia(v: Int) : Int {  }

    /*
     Indica si hay camino desde el vértice inicial s hasta el un vértice v.
     Si el camino existe retorna true, de lo contrario falso
     En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */ 
    fun hayCaminoHasta(v: Int) : Boolean {  }

    /*
     Retorna el camino con menos lados,  desde el vértice inicial s 
     hasta el un vértice v. El camino es representado como un objeto iterable con
     los vértices del camino desde s hasta v.
     En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */ 
    fun caminoConMenosLadosHasta(v: Int) : Iterable<Int>  {  }
}
