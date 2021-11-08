package ve.usb.grafoLib

/*
  Determina las componentes fuertementes conexas de un grafo 
  La componentes fuertementes conexas se determinan cuando 
  se crea un nuevo objeto de esta clase.
*/
public class CFC(val g: GrafoDirigido) {

    /*
     Retorna true si dos componentes están fuertemente conectados y
     falso en caso contrario. Si el algunos de los dos vértices de
     entrada, no pertenece al grafo, entonces se lanza un RuntineException
     */
    fun estanFuertementeConectados(v: Int, u: Int) : Boolean {
	
    }

    // Indica el número de componentes fuertemente conexas
    fun numeroDeCFC() : Int {
	
    }

    /*
     Retorna el identificador de la componente fuertemente conexa donde está contenido 
     el vértice v. El identificador es un número en el intervalo [0 , numeroDeCFC()-1].
     Si el vértice v no pertenece al grafo g se lanza una RuntimeException
     */
    fun obtenerIdentificadorCFC(v: Int) : Int {
	
    }
    
    fun  obternerCFC() : Iterable<MutableSet<Int>> {
	
    }

    /*
     Retorna el grafo componente asociado a las componentes fuertemente conexas. 
     El identificado de los vértices del grafo componente está asociado con los indicados en 
     la función obtenerCFC. Es decir, si por ejemplo si los vértices 5,6 y 8 de g pertenecen a la
     componentemente fuertemente conexa cero, entonces 
     obtenerIdentificadorCFC(5) = obtenerIdentificadorCFC(6) = obtenerIdentificadorCFC(8) = 0
     y se va a tener que el en grafo componente el vértice 0 representa a la componente conexa que
     contiene a los vértices 5,6 y 8 de g
     */
    fun obtenerGrafoComponente() : GrafoNoDirigido {
	
    }

}
