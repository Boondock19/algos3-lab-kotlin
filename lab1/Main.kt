import java.io.File
import java.io.BufferedReader

fun main() {
    
    // Lista para poder leer y recuperar los valores de los txts
    var listaArchivo = mutableListOf<String>()
    var numVertices : Int 
    var numLados : Int
    val listaArcos = mutableListOf<Arco>()
    val listaAristas = mutableListOf<Arco>()  
    

    //fun para leer y almacenar data de txts en forma de lista
    fun leerArchivo (nombreArchivo : String): List<String> {
        
        File(nombreArchivo).useLines{ lines -> lines.forEach { listaArchivo.add(it) }}
        
        return listaArchivo
    }


    

    leerArchivo("miniPeso.txt")
    println(listaArchivo)
    numVertices = listaArchivo[0].toInt()
    numLados = listaArchivo[1].toInt()
    println("Numero de vertices : ${numVertices} ....... Numero de lados : ${numLados}")
    var listaLados = listaArchivo.subList(2, listaArchivo.size)
    
    listaLados.forEach { 
        val ladoSinSeparador = it.split(" ")
        print("Este el lado sin separar del main que si funciona : ${ladoSinSeparador}")
        val newArco = Arco(ladoSinSeparador[0].toInt(),ladoSinSeparador[1].toInt(),ladoSinSeparador[2].toDouble())
        listaArcos.add(newArco)
    }
    println("Lista de lados del grafo: ${listaLados}");
    println("estea es la lista de ARCOS  : ${listaArcos}")
   val listaFiltrada = listaArcos.filter { it.first == 4 }
    println("estea es la lista de ARCOS FILTRADA : ${listaFiltrada}")


    
 
    val arcoPrueba = Arco(4,5)
    
    println("Procedemos con las pruebas de los metodos de arco: ")
    println("Fuente del arco :") 
    println(arcoPrueba.fuente())
    println("Sumidero del arco: ") 
    println(arcoPrueba.sumidero())
    println("peso del arco: ")
    println(arcoPrueba.obtenerPeso())
    println("arco to string:")
    println(arcoPrueba.toString())

    val aristaPrueba = Arista(4,5,5.0)
    val aristaPrueba2 = Arista(5,8,0.0)
    
    println("Procedemos con las pruebas de los metodos de arista: ")
    println("Cualquiera de los dos vertices de la arista :") 
    println(aristaPrueba.cualquieraDeLosVertices())
    println("El otro vertice: ") 
    println(aristaPrueba.elOtroVertice(4))
    println("peso del arco: ")
    println(aristaPrueba.obtenerPeso())
    println("arco to string:")
    println(aristaPrueba.toString())
    println("comperacion peso de arista: ")
    println(aristaPrueba.compareTo(aristaPrueba2))

    println("Creacion de la clase grafoDirigido Prueba: ")
    var grafoDirigidoPrueba = GrafoDirigido("mini.txt",false)
    println("print del grafo dirigido creado con un txt sin PESO: ${grafoDirigidoPrueba}")
    var grafoDirigidoPrueba3 = GrafoDirigido("miniPeso.txt",true)
    println("print del grafo dirigido creado con un txt con PESO: ${grafoDirigidoPrueba3}")
    var grafoDirigidoPrueba2 = GrafoDirigido(4)
    println("print del grafo dirigido creado un numero: ${grafoDirigidoPrueba2}")
    var arco1 = Arco(2,1)
    var arco2 = Arco(2,3)
    var arco3 = Arco(2,1)
    var arco4 = Arco(2,0)
    println("Este la propiedad first del Arco: ${arco3.first}")
    grafoDirigidoPrueba2.agregarArco(arco1)
    grafoDirigidoPrueba2.agregarArco(arco2)
    grafoDirigidoPrueba2.agregarArco(arco3)
    grafoDirigidoPrueba2.agregarArco(arco4)
    println("numero de lados del grafoPrueba2 : ${grafoDirigidoPrueba2.obtenerNumeroDeLados()}")
    println("numero de vertices del grafoPrueba2 : ${grafoDirigidoPrueba2.obtenerNumeroDeVertices()}")
    println("Estos son los Arcos del grafo : ${grafoDirigidoPrueba2.arcos()}")
    println("Estos son los Arcos adyacentes del vertice  : ${grafoDirigidoPrueba2.adyacentes(2)}")

    println("Este es el metodo toString() del grafo : ${grafoDirigidoPrueba2.toString()}" )
    println(grafoDirigidoPrueba2.toString())
  


// completar
}
