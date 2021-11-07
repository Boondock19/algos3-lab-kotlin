package ve.usb.grafoLib

// Retorna el digrafo inverso de un grafo
fun digrafoInverso(g: GrafoDirigido) : GrafoDirigido {
    var listaDeArcos = g.arcos()
    var listaDeArcosInversos = mutableListOf<Arco>()
    var numDeVertices = g.obtenerNumeroDeVertices()

    listaDeArcos.forEach{ a ->
        val primerVerticeInverso = a.segundoV
        val segundoVerticeInverso = a.primerV
        var arcoInverso = Arco(primerVerticeInverso,segundoVerticeInverso)
        listaDeArcosInversos.add(arcoInverso)
    }
    var digrafoInv = GrafoDirigido(numDeVertices,listaDeArcosInversos)
    
    return digrafoInv
}
