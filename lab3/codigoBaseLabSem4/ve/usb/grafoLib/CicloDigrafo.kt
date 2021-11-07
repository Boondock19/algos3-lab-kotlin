package ve.usb.grafoLib

/* 
   Determina la existencia o no de un ciclo en un digrafo.
   En el momento de la creación de un objeto de este tipo,
   se ejecuta una versión de  DFS que determina la existencia 
   o no de un ciclo. 
*/
public class CicloDigrafo(val g: GrafoDirigido) {
    var listaVertices = g.listaDeVertices()
    var cicloEncontrado = false
    var caminoVertices = mutableListOf<Int>() 
    dfs = BusquedaEnProfundidad(g)

    listaVertices.forEach{ v ->
        
    }

    // Si el grafo tiene un ciclo retorna la secuencia de vértices del ciclo,
    // y en caso contrario retorna una RuntineException
    fun cicloEncontrado() : Iterable<Int> {

    }

    // Retorna true si el digrafo G tiene un ciclo, false en caso contrario
    fun existeUnCiclo() : Boolean {

    }
    
} 
