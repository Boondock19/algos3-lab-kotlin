package ve.usb.grafoLib

public class Arco(val inicio: Int, val fin: Int, val peso: Double =0.0) : Lado(inicio, fin) {

    // Retorna el vértice inicial del arco
    fun fuente() : Int {

    }

    // Retorna el vértice final del arco
    fun sumidero() : Int {

    }

    // Retorna el peso o costo asociado del arco
    fun peso() : Double {
	
    }

    // Representación del arco
    override fun toString() : String {

     }
} 
