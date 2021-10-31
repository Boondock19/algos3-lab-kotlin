package ve.usb.grafoLib

public class Arista(val v: Int,
		    val u: Int,
		    val peso: Double =0.0) : Comparable<Arista>, Lado(v, u) {

    // Retorna el peso del arco
    fun peso() : Double {

    }

    // Representación en string de la arista
    override fun toString() : String {

    }

    /* 
     Se compara dos arista con respecto a su peso. 
     Si this.obtenerPeso > other.obtenerPeso entonces
     retorna 1. Si this.obtenerPeso < other.obtenerPeso 
     entonces retorna -1. Si this.obtenerPeso == other.obtenerPeso
     entonces retorna 0 
     */
     override fun compareTo(other: Arista): Int {

     }
} 
