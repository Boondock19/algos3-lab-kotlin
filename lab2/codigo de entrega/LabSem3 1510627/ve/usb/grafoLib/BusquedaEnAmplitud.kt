package ve.usb.grafoLib

import java.util.LinkedList
import java.util.Queue


/* 
   Implementación del algoritmo BFS. 
   Con la creación de la instancia, se ejecuta el algoritmo BFS
   desde el vértice s
*/
public class BusquedaEnAmplitud(val g: Grafo, val s: Int) {

        var listaDeVertices = mutableListOf<Int>()
        var listaDeColores = mutableListOf<Color>()
        var listaDeDistancias = mutableListOf<Int>()
        var listaDePredecesores = mutableListOf<Int?>()
        
        var numVertices = g.obtenerNumeroDeVertices() 
        var listaDeCamino = Array(numVertices) {mutableListOf<Int>()}
        
    
    
    init {
	// Se ejecuta BFS
        var cola : Queue<Int> = LinkedList<Int>()
        var u = 0
        var listaLados = g
        var adyacentes = g.adyacentes(s)
        //var flag = 0
          for (i in 0..numVertices-1) {
            listaDeVertices.add(i,i)
            listaDeColores.add(i,Color.BLANCO)
            listaDeDistancias.add(i,0)
            listaDePredecesores.add(i,null)
        }
             
            listaDeColores[s] = Color.GRIS
            listaDeDistancias[s] = 0
            cola.add(s)
            while (!cola.isEmpty()) {
                u = cola.peek()
                cola.remove()
                var adyacentes = g.adyacentes(u)
                adyacentes.forEachIndexed {index,lado ->
                   // var primerV = lado.first
                    
                    var otroV = lado.elOtroVertice(u)
                    if ( listaDeColores[otroV] == Color.BLANCO ) {
                        
                        listaDeColores[otroV] = Color.GRIS
                        listaDeDistancias[otroV] = listaDeDistancias[u] + 1
                        listaDePredecesores[otroV] = u
                       
                        cola.add(otroV)
                    }
                    listaDeColores[u] = Color.NEGRO    
                }
            }
            

         // println("Grafo de amplitud para el valor ${s}: ${g}")
       
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
     Retorna la distancia, del camino con menos lados, desde el vértice inicial s 
     hasta el un vértice v. 
     En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */
   fun obtenerDistancia(v: Int) : Int {  
          if ( v in this.listaDeVertices ) {
            return this.listaDeDistancias[v]
        } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
   }

    /*
     Indica si hay camino desde el vértice inicial s hasta el un vértice v.
     Si el camino existe retorna true, de lo contrario falso
     En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */ 
    fun hayCaminoHasta(v: Int) : Boolean { 
           if ( v in this.listaDeVertices ) {
               if (this.listaDeDistancias[v]!=0){
                   return true
               } else {
                   return false
               }
            } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
     }

    /*
     Retorna el camino con menos lados,  desde el vértice inicial s 
     hasta el un vértice v. El camino es representado como un objeto iterable con
     los vértices del camino desde s hasta v.
     En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */ 
    fun caminoConMenosLadosHasta(v: Int) : Iterable<Int>  { 
        var caminoPCorto = mutableListOf<Int?>()
        var caminoNulo = mutableListOf<Int>()
        var predecesor : Int?
         if ( v in this.listaDeVertices ) {
            var predecesor = v
            if (this.listaDePredecesores[predecesor] == null) {
                caminoNulo.add(0)
                return caminoNulo.asIterable()
                //throw Exception("El vertice ${v} no posee predecesores en el grafo")
            }
            caminoPCorto.add(v)
             while (this.listaDePredecesores[predecesor] != s){
                caminoPCorto.add(this.listaDePredecesores[predecesor])
                predecesor = this.listaDePredecesores[predecesor]!!
            }
            caminoPCorto.add(s)
           var caminoCorto = caminoPCorto.filterNotNull()
           caminoCorto = caminoCorto.reversed()
            return caminoCorto.asIterable()
        } else {
            throw Exception("El vertice ${v} no se encuentra en el grafo")
        }
     }
}
