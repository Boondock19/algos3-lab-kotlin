// Clase que representa a un lado en un digrafo.

public class Arco(val inicio: Int, val fin: Int, val peso: Double =0.0) {

    val arco = Triple(inicio,fin,peso)
    val first = inicio
    val second = fin
    val arcoPeso = peso

    // Retorna el vértice inicial del arco o lado
    fun fuente() : Int {
        return arco.first
    // Completar
    }

    // Retorna el vértice final del arco o lado
    fun sumidero() : Int {
        return arco.second
    // Completar
    }

    // Retorna el peso o costo asociado del arco o lado
    fun obtenerPeso() : Double {
        return arco.third
        // Completar
    }

    // Representación del arco
    override fun toString() : String {
        return "$arco" 
    // Completar
    }
} 
