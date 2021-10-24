fun main() {

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


// completar
}
