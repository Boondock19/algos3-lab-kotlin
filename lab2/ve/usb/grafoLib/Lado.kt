package ve.usb.grafoLib

abstract class Lado(val a: Int, val b: Int) {
    val lado = Pair(a,b)
    var primerV=lado.first
    var segundoV=lado.second

    // Retorna cualquiera de los dos vértices del grafo
    fun cualquieraDeLosVertices() : Int {
        // Obtenemos un valor random entre 1 y 2 para seleccionar uno de los vertices
        return lado.first
    }

    // Dado un vertice w, si w == a entonces retorna b, de lo contrario si w == b
    // entonces retorna a,  y si w no es igual a a ni a b, entonces se lanza una RuntimeExpception 
    fun elOtroVertice(w: Int) : Int {
        var r = 0
        if (w == lado.first) {
            r = lado.second
        } else if (w == lado.second) {
            r = lado.first
        } else {
            throw Exception("El vertice ${w} no pertenece a este lado")
        }

        return r
    }
}
