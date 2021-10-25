// Esta clase implementa la representación de los lados en los grafos no dirigidos.

// El constructor recibe dos parámetros obligatorios que son los dos vértices del lado,
// mientras que el tercer parámetro es opcional y es cero en caso de no ser especificado
public class Arista(val v: Int, val u: Int, val peso: Double =0.0)  : Comparable<Arista> {

    val arista = Triple(v,u,peso)
    val first = v
    val second = u
    val aristaPeso = peso
    
     /*
        descripcion: Funcion que retorna cualquiera de los vertices de una arista
         
        precondiciones: que el objeto que invoca al metodo sea una arista

        postcondiciones: entero que representa a un vertice de una arista

        tiempo de la operacion: O(1)

     */
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

    
    /*
        descripcion: Funcion que retorna al otro vertice perteneciente
         a una arista
         
        precondiciones: que el objeto que invoca al metodo sea una arista y que w sea un valor presente en la arista

        postcondiciones: entero que representa a un vertice de una arista

        tiempo de la operacion: O(1)

     */
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

    /*
        descripcion: Funcion que retorna el valor del peso de una arista 
         
        precondiciones: que el objeto que invoca al metodo sea una arista

        postcondiciones: numero real que representa al peso de la arista

        tiempo de la operacion: O(1)

     */
    fun obtenerPeso() : Double {

        return arista.third
    // Completar
    }

    /*
        descripcion: Funcion que retorna la representacion en string de una arista
         
        precondiciones: que el objeto que invoca al metodo sea un arista

        postcondiciones: string que representa a una arista

        tiempo de la operacion: O(1)

     */
    override fun toString() : String {
        return "$arista"
    // Completar
    }

    // Se compara dos arista con respecto a su peso. Si this.obtenerPeso > other.obtenerPeso entonces
    // retorna 1. Si this.obtenerPeso < other.obtenerPeso entonces retorna -1. Si this.obtenerPeso == other.obtenerPeso
    // entonces retorna 0
    /*
        descripcion: Funcion que retorna un entero dependiendo de si el peso
        de la arista actual es mayor,menor o igual en cuyos casos retorna
        1,-1 o 0 respectivamente.
         
        precondiciones: que el objeto que invoca al metodo sea una arista y se le pase otra arista

        postcondiciones: entero que representa que arista pesa mas

        tiempo de la operacion: O(1)

     */
     override fun compareTo(other: Arista): Int {
         val otherPeso = other.obtenerPeso();
         val aristaPeso = this.obtenerPeso()
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
