// Esta clase implementa la representación de los lados en los grafos no dirigidos.

// El constructor recibe dos parámetros obligatorios que son los dos vértices del lado,
// mientras que el tercer parámetro es opcional y es cero en caso de no ser especificado
public class Arista(val v: Int, val u: Int, val peso: Double =0.0)  : Comparable<Arista> {

    // Retorna cualquiera de los dos vértices del grafo
    fun cualquieraDeLosVertices() : Int {
	// Completar
    }

    // Dado un vertice w, si w == v entonces retorna u, de lo contrario si w == u  entonces retorna v,  y si w no es igual a v ni a u, entonces se lanza una RuntimeExpception 
    fun elOtroVertice(w: Int) : Int {
	// Completar
    }

    // Retorna el peso del arco
    fun obtenerPeso() : Double {
	// Completar
    }

    // Representación en string de la arista
    override fun toString() : String {
	// Completar
    }

    // Se compara dos arista con respecto a su peso. Si this.obtenerPeso > other.obtenerPeso entonces
    // retorna 1. Si this.obtenerPeso < other.obtenerPeso entonces retorna -1. Si this.obtenerPeso == other.obtenerPeso
    // entonces retorna 0
     override fun compareTo(other: Arista): Int {
	 // Completar
     }
} 
