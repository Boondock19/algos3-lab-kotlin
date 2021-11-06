import ve.usb.grafoLib.*
import kotlin.system.measureTimeMillis


fun leerEntrada(args: Array<String>): Grafo {
    if (args.size < 1) throw RuntimeException("No se ha encontrado el parametro tipo de grafo [n|d]")
    if ( (args[0] != "n" && args[0] != "d")) throw RuntimeException("Valor invalido para parametro tipo de grafo [n|d]")
    if (args.size < 2) throw RuntimeException("No se ha encontrado el parametro archivo de grafo")
    if (args.size > 2) throw RuntimeException("comando toma solo dos parametros")
    var G:Grafo
    var filename = args[1]
    try {
        
        println("\ncargando grafo del archivo $filename")
        if (args[0] == "d") G = GrafoDirigido(args[1], false)
        else G = GrafoNoDirigido(args[1], false)
        println("grafo cargado")
    } catch(e:java.io.FileNotFoundException) {
        val cwd = System.getProperty("user.dir")
        throw java.io.FileNotFoundException("no se ha podido cargar el grafo $filename. Asegurese de que el archivo se encuentre en el directorio de trabajo actual $cwd")
    }
    return G
}

fun main(args: Array<String>) {

    var G:Grafo = leerEntrada(args)
    println(G)

    val vertices = G.vertices().toMutableList()
    
    G.vertices().forEach{v ->

        val BFS = BusquedaEnAmplitud(G, v)
        var caminos = vertices.toList().map{ BFS.caminoConMenosLadosHasta(it) }
        if (!BFS.vertices.any{ it.get("predecesor") as Int? == v }) println("\nno hay caminos que partan desde $v")
        else if (caminos.reduce{ a, b -> a + b }.toList().size == 0) {
            println("\nya han sido contado los caminos unicos desde $v")
        }
        else {
            println("\nvertice: $v")
            caminos.forEach { camino -> 
                if (camino.toList().size > 0 ){
                    val u = camino.last() 
                    println("camino hasta $u: $camino")
                }
            }
            if (G is GrafoNoDirigido) vertices.remove(v)
        }
        print("\n(presione enter para continuar)")
        readLine()
    }
    println()
    G.lados().forEach { a-> 
        val DFS = BusquedaEnProfundidad(G)
        println("tipo de lado $a: " + DFS.tipodeLado(a))
    }


}
