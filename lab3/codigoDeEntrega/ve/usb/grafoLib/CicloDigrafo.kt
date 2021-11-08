package ve.usb.grafoLib

/* 
   Determina la existencia o no de un ciclo en un digrafo.
   En el momento de la creación de un objeto de este tipo,
   se ejecuta una versión de  DFS que determina la existencia 
   o no de un ciclo. 
*/
public class CicloDigrafo(val g: GrafoDirigido) {
    var dfs = BusquedaEnProfundidad(g)
    var listaDeArcos = g.arcos()
    var cicloFlag = false
    var caminoCiclo = mutableListOf<Int>()
    var ladoSumidero = 0
    var ladoFuente = 0    
   

    // Si el grafo tiene un ciclo retorna la secuencia de vértices del ciclo,
    // y en caso contrario retorna una RuntineException
   fun cicloEncontrado() : Iterable<Int> {
     listaDeArcos.forEach   {l ->
     var edge = dfs.edges(l)
     
     if (edge == "BACK"){
         cicloFlag = true
         
        }
    if( !cicloFlag ){
        throw Exception("El grafo ingresado no posee ciclos")
        }
    if( dfs.edges(l) == "BACK") {
       var ladoFuente = l.fuente()
       var ladoSumidero = l.sumidero()
        caminoCiclo.add(ladoFuente)
       // var predecesorsig = dfs.obtenerPredecesor(ladoFuente) as Int
        while (  dfs.obtenerPredecesor(ladoFuente) as Int != ladoSumidero){
            ladoFuente = dfs.obtenerPredecesor(ladoFuente) as Int
            caminoCiclo.add(ladoFuente)
            }
       caminoCiclo.add(ladoSumidero)
        }
        if (caminoCiclo.size > 0) return caminoCiclo.asIterable()
    } 
        
   
   return caminoCiclo.asIterable()     
        
    
}

    // Retorna true si el digrafo G tiene un ciclo, false en caso contrario
    fun existeUnCiclo() : Boolean {
        listaDeArcos.forEach{l ->
        var edge = dfs.edges(l)
        if (edge == "BACK"){
            cicloFlag = true
        }
        
      }
        return cicloFlag
    }
    
} 
