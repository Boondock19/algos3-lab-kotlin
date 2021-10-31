package ve.usb.grafoLib

import java.io.File

public class GrafoDirigido : Grafo {

    // Se construye un grafo a partir del número de vértices
    constructor(numDeVertices: Int) {

    }

    /*
     Se construye un grafo a partir de un archivo. Existen dos tipos de formatos de archivo.
     El primero solo incluye los vétices de los lados, sin los pesos. El formato es como sigue.
     La primera línea es el número de vértices. La segunda línea es el número de lados. Las siguientes líneas
     corresponden a los lados, con los vértices de un lado separados por un espacio en blanco.
     El segundo formato solo se diferencia del primero en que cada línea de los lados tiene a dos enteros
     que corresponden a los vértices de los lados y un número real que es el peso o costo del lado.
     La variable conPeso es true si el archivo de entrada contiene un formato que incluye los pesos de los
     lados. Es false si el formato solo incluye los vértices de los lados. Se asume que los datos del 
     archivo están correctos, no se verificas.
     */  
    constructor(nombreArchivo: String, conPeso: Boolean)  {

    }

    // Agrega un lado al digrafo
    fun agregarArco(a: Arco) {

    }

    // Retorna el grado del grafo. Si el vértice no pertenece al grafo se lanza una RuntimeException
    override fun grado(v: Int) : Int {

    }

    // Retorna el grado exterior del grafo. Si el vértice no pertenece al grafo se lanza una RuntimeException
    fun gradoExterior(v: Int) : Int {

    }

    // Retorna el grado interior del grafo. Si el vértice no pertenece al grafo se lanza una RuntimeException
    fun gradoInterior(v: Int) : Int {

    }

    // Retorna el número de lados del grafo
    override fun obtenerNumeroDeLados() : Int {

    }

    // Retorna el número de vértices del grafo
    override fun obtenerNumeroDeVertices() : Int {

    }

    /* 
     Retorna los adyacentes de v, en este caso los lados que tienen como vértice inicial a v. 
     Si el vértice no pertenece al grafo se lanza una RuntimeException
     */
    override fun adyacentes(v: Int) : Iterable<Arco> {

    }

    // Retorna todos los lados del digrafo
    fun arcos() : Iterable<Arco> {

    }
    
    // String que muestra el contenido del grafo
    override fun toString() : String {

    }
}
