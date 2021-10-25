import java.io.File
import java.io.BufferedReader

// Clase que implementa un digrafo como una lista de adyacencia
public class GrafoDirigido {

        val listaArchivo = mutableListOf<String>()
        var numVertices = 0
        var numLados = 0
        var listaArcos = mutableListOf<Arco>()
        var listaVertices = mutableListOf<Int>()
        var listaLados =  mutableListOf<String>()
        var grafo = Array(numVertices) {mutableListOf<Arco>()}

    
    // Se construye un grafo a partir del número de vértices
    constructor(numDeVertices: Int) {
        
        this.numVertices = numDeVertices
        this.grafo = Array(this.numVertices) {mutableListOf<Arco>()}
        
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
        

        //fun para leer y almacenar data de txts en forma de lista
        
        File(nombreArchivo).useLines{ lines -> lines.forEach { this.listaArchivo.add(it) }}
        
        // Almacenamos data del grafo como cantidad de vertices y lados
        
       this.numVertices = listaArchivo[0].toInt()
       this.numLados = listaArchivo[1].toInt()
       this.grafo = Array(this.numVertices) {mutableListOf<Arco>()}
        
        // Creamos una subLista para poder trabajar con los lados
        
        this.listaLados = listaArchivo.subList(2, listaArchivo.size)
        

        /** 
            Creamos los Arcos y los agregamos en la lista de adyacencia dependiendo
            de si el archivo posee formato con peso o no.
        */ 
        
        if (conPeso == true) {
            this.listaLados.forEach { 
            val arcosFiltrados = mutableListOf<Arco>()
            val ladoSinSeparador = it.split(" ")
            val newArco = Arco(ladoSinSeparador[0].toInt(),ladoSinSeparador[1].toInt(),ladoSinSeparador[2].toDouble())
            this.listaArcos.add(newArco)
            
                
            }
        } else {
            this.listaLados.forEach { 
            val ladoSinSeparador = it.split(" ")
            val newArco = Arco(ladoSinSeparador[0].toInt(),ladoSinSeparador[1].toInt())
            this.listaArcos.add(newArco)
            
            }

            this.grafo.forEachIndexed { index, lista ->
                var arcosFiltrada = this.listaArcos.filter {it.first == index }
                this.grafo.set(index, arcosFiltrada.toMutableList()) 
            }
            
        }   
    // completar
    }

// String que muestra el contenido del grafo
    override fun toString() : String {
        var representacionGrafo = ""
        this.grafo.forEachIndexed { index, lista ->
            
            representacionGrafo += "${index} : ${this.grafo[index]} \n"
            
         }
            
        return " ${representacionGrafo}"
    // completar
     }

    // Agrega un lado al digrafo
    fun agregarArco(a: Arco) {
        val newArco = a
        var arcosFiltrados = mutableListOf<Arco>()
        
        this.listaArcos.forEachIndexed { index,arco ->
            if (newArco.first == arco.first && newArco.second == arco.second) {
                return println("El arco ${a} ya se encuentra en el grafo")
        }
        }
        
        
        this.listaArcos.add(newArco)
        arcosFiltrados.add(newArco)

        
        this.grafo.set(newArco.first,(this.grafo[newArco.first]+arcosFiltrados).toMutableList())
        this.numLados += 1 
        
        var stringGrafo = this.toString()
        
        return println("El arco ${a} fue agregado satisfactoriamente al grafo : ${stringGrafo}")
    // completar
    }

    // Retorna el número de lados del grafo
    fun obtenerNumeroDeLados() : Int {
        return this.numLados
    // completar
    }

    // Retorna el número de vértices del grafo
    fun obtenerNumeroDeVertices() : Int {
        return this.numVertices
    // completar
    }

    

    // Retorna los adyacentes de v, en este caso los lados que tienen como vértice inicial a v
    fun adyacentes(v: Int) : Iterable<Arco> {
        var arcosAdyacentes = mutableListOf<Arco>()
        this.listaArcos.forEachIndexed {index,arco ->
            if (arco.first ==  v) {
                arcosAdyacentes.add(arco)
            }
        }
        
        arcosAdyacentes.asIterable()

        return arcosAdyacentes
    // completar
    }
    

    // Retorna todos los lados del digrafo
    fun arcos() : Iterable<Arco> {
       var arcosIterables = this.listaArcos.asIterable()
       // while ()
       return arcosIterables
	// completar
    }

    

    
}
