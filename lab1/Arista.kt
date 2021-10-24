// Esta clase implementa la representación de los lados en los grafos no dirigidos.

// El constructor recibe dos parámetros obligatorios que son los dos vértices del lado,
// mientras que el tercer parámetro es opcional y es cero en caso de no ser especificado
public class Arista(val v: Int, val u: Int, val peso: Double =0.0)  : Comparable<Arista> {

    val arista = Triple(v,u,peso)
    // Retorna cualquiera de los dos vértices del grafo
    fun cualquieraDeLosVertices() : Int {
        // Obtenemos un valor random entre 1 y 2 para seleccionar uno de los vertices
        val randomValue = (1..2).random()
        if (randomValue == 1) {
            return arista.first
        } else {
            return arista.second
        }
    // Completar
    }

    // Dado un vertice w, si w == v entonces retorna u, de lo contrario si w == u  entonces retorna v,  y si w no es igual a v ni a u, entonces se lanza una RuntimeExpception 
    fun elOtroVertice(w: Int) : Int {
        var r = 0
        if (w == arista.first) {
            r = arista.second
        } else if (w == arista.second) {
            r = arista.first
        }

        return r
        // Completar
    }

    // Retorna el peso del arco
    fun obtenerPeso() : Double {
       public val aristaPeso = arista.third 
        return arista.third
    // Completar
    }

    // Representación en string de la arista
    override fun toString() : String {
        return "$arista"
    // Completar
    }

    // Se compara dos arista con respecto a su peso. Si this.obtenerPeso > other.obtenerPeso entonces
    // retorna 1. Si this.obtenerPeso < other.obtenerPeso entonces retorna -1. Si this.obtenerPeso == other.obtenerPeso
    // entonces retorna 0
     override fun compareTo(other: Arista): Int {
         val otherPeso = other.obtenerPeso();
         if (aristaPeso > otherPeso) {
             return 1
         } else if (aristaPeso < otherPeso ) {
             return -1
         } else {
             return 0
         }
     // Completar
     }
} 
