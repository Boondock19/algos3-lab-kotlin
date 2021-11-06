package ve.usb.grafoLib

import java.util.LinkedList

/* 
   Implementación del algoritmo DFS. 
   Con la creación de la instancia, se ejecuta el algoritmo DFS
   desde todos los vértices del grafo
*/
public class BusquedaEnProfundidad(val G: Grafo) {

    var tiempo = 0

    val vertices:MutableList<MutableMap<String, Any?>> = mutableListOf()
    val Q:MutableList<Int> = mutableListOf()

    fun initVertices() {
        G.vertices().forEach { 
            vertices.add(mutableMapOf(
                "color" to Color.BLANCO,
                "predecesor" to null,
                "ti" to 0,
                "tf" to 0,
            ))
        }
    }
    
    init {
        initVertices()
        G.vertices().forEach { v->
            if (vertices.get(v).get("color") == Color.BLANCO) dfsVisit(v)
        }
    }

    private fun dfsVisit(v: Int) {
        tiempo++
        vertices.get(v).put("ti", tiempo)
        vertices.get(v).put("color", Color.GRIS)
        G.adyacentes(v).forEach { u ->
            if (vertices.get(u).get("color") == Color.BLANCO) {
                vertices.get(u).put("predecesor", v)
                dfsVisit(u) 
            }
        }
        vertices.get(v).put("color", Color.NEGRO)
        tiempo++
        vertices.get(v).put("tf", tiempo)
    }

    /*
     Retorna el predecesor de un vértice v. Si el vértice no tiene predecesor 
     se retorna null. En caso de que el vértice v no exista en el grafo se lanza
     una RuntimeException 
     */    
    fun obtenerPredecesor(v: Int) : Int? { 
        G.validarVertice(v)
        return vertices.get(v).get("predecesor") as Int?
    }

    fun masAntiguo(u:Int, v:Int):Int? {
        val uti = vertices.get(u).get("ti") as Int
        val utf = vertices.get(u).get("tf") as Int
        val vti = vertices.get(v).get("ti") as Int
        val vtf = vertices.get(v).get("tf") as Int 
        if (uti < vti && vtf < utf) return u
        else if (vti < uti && utf < vtf) return v
        else return null
    }

    fun tipodeLado(a:Lado):String {
        if (obtenerPredecesor(a.a) == a.b ||
        obtenerPredecesor(a.b) == a.a) return "TREE"
        if (G is GrafoNoDirigido || a.a == a.b) return "BACK"
        when(masAntiguo(a.a, a.b)) {
            a.a  -> return "FORWARD"
            a.b  -> return "BACK"
            else -> return "CROSS"
        }
    }

     /*
     Retorna un par con el tiempo inical y final de un vértice durante la ejecución de DFS. 
      En caso de que el vértice v no exista en el grafo se lanza una RuntimeException 
     */
    fun obtenerTiempos(v: Int) : Pair<Int, Int> { 
        G.validarVertice(v)
        val m = vertices.get(v)
        return Pair(m.get("ti") as Int, m.get("tf") as Int)
     }
}
