package ve.usb.grafoLib

import java.util.LinkedList
import java.util.Queue


/* 
   Implementación del algoritmo DFS. 
   Con la creación de la instancia, se ejecuta el algoritmo DFS
   desde todos los vértices del grafo
*/
public class BusquedaEnProfundidad(val g: Grafo) {
    
    var listaDeVertices :MutableList<MutableMap<String, Any?>> = mutableListOf()
    var numVertices = g.obtenerNumeroDeVertices()
    var tiempo : Int 
    var vertices = mutableListOf<Int>()
    init {
	
    // Se ejecuta DFS
        for (i in 0..numVertices-1 ) {
            this.listaDeVertices.add(mutableMapOf(
                "color" to Color.BLANCO,
                "predecesor" to null,
                "ti" to 0,
                "tf" to 0,
            ))

            this.vertices.add(i)
        }
        
        tiempo = 0
        
        println("Esta es la lista de vertices con un mutableMaP :  ${this.listaDeVertices} \n")
       
         for (i in 0..numVertices-1 ){
        if (listaDeVertices.get(i).get("color") == Color.BLANCO) {
            dfsVisit(g,i)
            }
        }
         println("Esta es la lista de vertices con un mutableMaP luego del dfs:  ${this.listaDeVertices} \n")
    }

     
    private fun dfsVisit(g: Grafo, u: Int) {
        var adyacencia = g.adyacentes(u)
        this.tiempo = tiempo + 1
        this.listaDeVertices.get(u).put("ti",tiempo)
        this.listaDeVertices.get(u).put("color",Color.GRIS)
        adyacencia.forEach { lado ->
            var otroV = lado.elOtroVertice(u)
            if (this.listaDeVertices.get(otroV).get("color")==Color.BLANCO) {
                this.listaDeVertices.get(otroV).put("predecesor",u)
                dfsVisit(g,otroV)                
            }

        }

        this.listaDeVertices.get(u).put("color",Color.NEGRO)
        this.tiempo = tiempo + 1
        this.listaDeVertices.get(u).put("tf",tiempo)

     }
     

    /*
     Retorna el predecesor de un vértice v. Si el vértice no tiene predecesor 
     se retorna null. En caso de que el vértice v no exista en el grafo se lanza
     una RuntimeException 
     */    
     
    fun obtenerPredecesor(v: Int) : Int? { 
          if ( v in this.vertices ) {
            return this.listaDeVertices.get(v).get("predecesor") as Int?
        } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
    }
    
     /*
     Retorna un par con el tiempo inical y final de un vértice durante la ejecución de DFS. 
      En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */
     
    fun obtenerTiempos(v: Int) : Pair<Int, Int> { 
        
          if ( v in this.vertices ) {
            val vertice = listaDeVertices.get(v)
            var parTiempo = Pair( vertice.get("ti") as Int , vertice.get("tf") as Int)

            return parTiempo
        } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
     }
    
    //Comparamos para obtener el vertice tiempo final mayor
   fun  comparacionTiempo(a:Int,b:Int): Int? {
       val tiempoIa = this.listaDeVertices.get(a).get("ti") as Int
       val tiempoFa = this.listaDeVertices.get(a).get("tf") as Int
       val tiempoIb = this.listaDeVertices.get(b).get("ti") as Int
       val tiempoFb = this.listaDeVertices.get(b).get("tf") as Int
       if (tiempoIa < tiempoIb && tiempoFb < tiempoFa) return a
        else if (tiempoIb < tiempoIa && tiempoFa < tiempoFb) return b
        else return null
   }

    fun edges(l:Lado): String {
        if (obtenerPredecesor(l.primerV) == l.segundoV ||
        obtenerPredecesor(l.segundoV) == l.primerV) return "TREE"
        if (g is GrafoNoDirigido || l.primerV == l.segundoV) return "BACK"
        when(comparacionTiempo(l.primerV,l.segundoV)) {
            l.primerV  -> return "FORWARD"
            l.segundoV  -> return "BACK"
            else -> return "CROSS"
        }
    }
}
