
import java.io.File
import java.io.BufferedReader

// Clase que implementa grafo no dirigido como una lista de adyacencia

public class GrafoNoDirigido {

        val listaArchivo = mutableListOf<String>()
        var numVertices = 0
        var numLados = 0
        var listaAristas = mutableListOf<Arista>()
        var listaVertices = mutableListOf<Int>()
        var listaLados =  mutableListOf<String>()
        var grafo = Array(numVertices) {mutableListOf<Arista>()}
    
    // Se construye un grafo a partir del número de vértices
    constructor(numDeVertices: Int) {
	    this.numVertices = numDeVertices
        this.grafo = Array(this.numVertices) {mutableListOf<Arista>()}
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
        var flag = conPeso
        
        //fun para leer y almacenar data de txts en forma de lista
        
        File(nombreArchivo).useLines{ lines -> lines.forEach { this.listaArchivo.add(it) }}
        
        // Almacenamos data del grafo como cantidad de vertices y lados
        
       this.numVertices = listaArchivo[0].toInt()
       this.numLados = listaArchivo[1].toInt()
       this.grafo = Array(this.numVertices) {mutableListOf<Arista>()}
        
        // Creamos una subLista para poder trabajar con los lados
        
        this.listaLados = listaArchivo.subList(2, listaArchivo.size)
        
        

        /** 
            Creamos los Aristas y los agregamos en la lista de adyacencia dependiendo
            de si el archivo posee formato con peso o no.
        */ 
        
        if (flag) {
            this.listaLados.forEach { 
            val ladoSinSeparador = it.split(" ")
            
            val newArista = Arista(ladoSinSeparador[0].toInt(),ladoSinSeparador[1].toInt(),ladoSinSeparador[2].toDouble())
            this.listaAristas.add(newArista)
            
            }
        } else {
            
            this.listaLados.forEach { 
            val ladoSinSeparador = it.split(" ")
            val newArista = Arista(ladoSinSeparador[0].toInt(),ladoSinSeparador[1].toInt())
            this.listaAristas.add(newArista)
            }   
         } 
            this.grafo.forEachIndexed { index, lista ->
                var aristasFiltrada = this.listaAristas.filter {it.first == index }
                this.grafo.set(index, aristasFiltrada.toMutableList()) 
            }
    // completar
    }

    /*
        descripcion: Funcion que retorna un mensaje al agregar satisfactoriamente la arista
        y muestra al grafo luego de asignar la arista.
         
        precondiciones: que el objeto que invoca al metodo sea un grafo y se le pase una arista,
        adicionalmente que no se encuentre la arista que se desea agregar en el grafo

        postcondiciones: string que representa a un grafo luego de agregar el arco

        tiempo de la operacion: O(n) siendo n el size de los numeros de lado

     */
    fun agregarArista(a: Arista) {
        val newArista = a
        var aristasFiltrados = mutableListOf<Arista>()
        
        this.listaAristas.forEachIndexed { index,arista ->
            if ((newArista.first == arista.first && newArista.second == arista.second) || (newArista.first == arista.second && newArista.second == arista.first)) {
                return println("El arista ${a} ya se encuentra en el grafo")
        }
        }
        
        
        this.listaAristas.add(newArista)
        aristasFiltrados.add(newArista)

        
        this.grafo.set(newArista.first,(this.grafo[newArista.first]+aristasFiltrados).toMutableList())
        this.numLados += 1 
        
        var stringGrafo = this.toString()
        
        return println("La arista ${a} fue agregado satisfactoriamente al grafo : ${stringGrafo}")
    
    }

     /*
        descripcion: Funcion que retorna un int que representa la cantidad de lados del grafo no dirigido
         
        precondiciones: que el objeto que invoca al metodo sea un grafo no dirigido

        postcondiciones: int que representa la cantidad de lados o arcos de un grafo no dirigido

        tiempo de la operacion: O(1) 

     */
    fun obtenerNumeroDeLados() : Int {
        return this.numLados
    // completar
    }

     /*
        descripcion: Funcion que retorna un int que representa la cantidad de vertices del grafo no dirigido
         
        precondiciones: que el objeto que invoca al metodo sea un grafo no dirigido

        postcondiciones: int que representa la cantidad de vertices  de un grafo no dirigido

        tiempo de la operacion: O(1) 

     */
    fun obtenerNumeroDeVertices() : Int {
        return this.numVertices
    // completar
    }

    // Retorna los lados adyacentes al vértice v, es decir, los lados que contienen al vértice v
    /*
        descripcion: Funcion que retorna una lista que contiene las aristas que 
        tengan como vertice  a v. 
         
        precondiciones: que el objeto que invoca al metodo sea un digrafo y se le pase un int

        postcondiciones: lista que contiene los arcos que 
        contengan como vertice  a v

        tiempo de la operacion: O(n) siendo n el size de los numeros de lados

     */
    fun adyacentes(v: Int) : Iterable<Arista> {
        var aristasAdyacentes = mutableListOf<Arista>()
        this.listaAristas.forEachIndexed {index,arista ->
            if (arista.first ==  v || arista.second == v) {
                aristasAdyacentes.add(arista)
            }
        }
        
        aristasAdyacentes.asIterable()

        return aristasAdyacentes
    // completar
    }

      /*
        descripcion: Funcion que retorna una lista que representa los lados del grafo no dirigido
         
        precondiciones: que el objeto que invoca al metodo sea un grafo no dirigido

        postcondiciones: lista que representa los lados del grafo no dirigido

        tiempo de la operacion: O(1) 

     */
    fun aristas() : Iterable<Arista> {
        var aristaIterables = this.listaAristas.asIterable()
       
       return aristaIterables
    // completar
    }

    /*
        descripcion: Funcion que retorna el la representacion en string de un grafo no dirigido
         
        precondiciones: que el objeto que invoca al metodo sea un grafo no dirigido

        postcondiciones: string que representa a un grafo no dirigido

        tiempo de la operacion: O(n) siendo n el size del grafo

     */
    override fun toString() : String {
        var representacionGrafo = ""
        this.grafo.forEachIndexed { index, lista ->
            
            representacionGrafo += "${index} : ${this.grafo[index]} \n"
            
         }
            
        return " ${representacionGrafo}"
    // completar
     }
}
