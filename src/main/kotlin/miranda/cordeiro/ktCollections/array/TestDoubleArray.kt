package miranda.cordeiro.ktCollections

fun main(){

    val salarios = DoubleArray(4)
    salarios[0] = 2500.00
    salarios[1] = 1200.00
    salarios[2] = 800.00
    salarios[3] = 5000.00
    salarios.forEach { println(it) }

    println("*****************************************")
    /*forEachIndexed permite trabalhar com o valor do indice e com o valor do array*/
    salarios.forEachIndexed{
        index,salario ->
        salarios[index] =  salario* 1.3
        println(salarios[index])
    }
    println("*****************************************")
    salarios.sort()
    salarios.forEach { println(it) }

}