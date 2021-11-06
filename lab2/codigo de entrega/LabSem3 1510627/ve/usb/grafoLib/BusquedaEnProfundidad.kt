package ve.usb.grafoLib

import java.util.LinkedList
import java.util.Queue


/* 
   Implementación del algoritmo DFS. 
   Con la creación de la instancia, se ejecuta el algoritmo DFS
   desde todos los vértices del grafo
*/
public class BusquedaEnProfundidad(val g: Grafo) {
    var listaDeVertices = mutableListOf<Int>()
    var listaDeColores = mutableListOf<Color>()
    var listaDeTi = mutableListOf<Int>()
    var listaDeTf = mutableListOf<Int>()
    var listaDePredecesores = mutableListOf<Int?>()
    var numVertices = g.obtenerNumeroDeVertices()
    var tiempo : Int 
    
    init {
	// Se ejecuta DFS
        var cola : Queue<Int> = LinkedList<Int>()
        var listaLados = g
        tiempo = 0
        for (i in 0..numVertices-1) {
            listaDeVertices.add(i,i)
            listaDeColores.add(i,Color.BLANCO)
            listaDeTi.add(i,0)
            listaDeTf.add(i,0)
            listaDePredecesores.add(i,null)
        }
        
        listaDeVertices.forEachIndexed{index, vertice ->
            dfsVisit(g,vertice)
         }

   
    }

    private fun dfsVisit(g: Grafo, u: Int) {
        var adyacencia = g.adyacentes(u)
        this.tiempo = tiempo + 1
        this.listaDeTi[u] = tiempo
        this.listaDeColores[u] = Color.GRIS 
        adyacencia.forEachIndexed { index , lado ->
            var otroV = lado.elOtroVertice(u)
            if (listaDeColores[otroV]==Color.BLANCO) {
                this.listaDePredecesores[otroV] = u
                dfsVisit(g,otroV)                
            }

        }

        this.listaDeColores[u] = Color.NEGRO
        this.tiempo = tiempo + 1
        this.listaDeTf[u] = tiempo

     }

    /*
     Retorna el predecesor de un vértice v. Si el vértice no tiene predecesor 
     se retorna null. En caso de que el vértice v no exista en el grafo se lanza
     una RuntimeException 
     */    
    fun obtenerPredecesor(v: Int) : Int? { 
          if ( v in this.listaDeVertices ) {
            return this.listaDePredecesores[v]
        } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
    }

     /*
     Retorna un par con el tiempo inical y final de un vértice durante la ejecución de DFS. 
      En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */
    fun obtenerTiempos(v: Int) : Pair<Int, Int> { 
        
          if ( v in this.listaDeVertices ) {
            
            var parTiempo = Pair(this.listaDeTi[v],this.listaDeTf[v])

            return parTiempo
        } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
     }
}
