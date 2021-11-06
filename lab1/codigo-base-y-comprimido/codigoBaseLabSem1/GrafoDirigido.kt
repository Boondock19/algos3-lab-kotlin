// Clase que implementa un digrafo como una lista de adyacencia
public class GrafoDirigido {

    // Se construye un grafo a partir del número de vértices
    constructor(numDeVertices: Int) {
	// completar
    }

    // Se construye un grafo a partir de un archivo. Existen dos tipos de formatos de archivo.
    // El primero solo incluye los vétices de los lados, sin los pesos. El formato es como sigue.
    // La primera línea es el número de vértices. La segunda línea es el número de lados. Las siguientes líneas
    // corresponden a los lados, con los vértices de un lado separados por un espacio en blanco.
    // El segundo formato solo se diferencia del primero en que cada línea de los lados tiene a dos enteros
    // que corresponden a los vértices de los lados y un número real que es el peso o costo del lado.
    // La variable conPeso es true si el archivo de entrada contiene un formato que incluye los pesos de los
    // lados. Es false si el formato solo incluye los vértices de los lados.  
    constructor(nombreArchivo: String, conPeso: Boolean) {
	// completar
    }

    // Agrega un lado al digrafo
    fun agregarArco(a: Arco) {
	// completar
    }

    // Retorna el número de lados del grafo
    fun obtenerNumeroDeLados() : Int {
	// completar
    }

    // Retorna el número de vértices del grafo
    fun obtenerNumeroDeVertices() : Int {
	// completar
    }

    // Retorna los adyacentes de v, en este caso los lados que tienen como vértice inicial a v
    fun adyacentes(v: Int) : Iterable<Arco> {
	// completar
    }

    // Retorna todos los lados del digrafo
    fun arcos() : Iterable<Arco> {
	// completar
    }

    // String que muestra el contenido del grafo
    override fun toString() : String {
	// completar
     }
}
