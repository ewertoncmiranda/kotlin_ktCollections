package miranda.cordeiro.ktCollections

fun main(){
    val values = IntArray(5)
    values [0] = 4
    values [1] = 2
    values [2] = 6
    values [3] = 1
    values [4] = 89
    values.forEach {x -> x+2 }
    println("*****************************************")
    /*o for each tradicional ,para cada valor de lista/array faça valor.. */
    for(test in values){ println(test)}
    println("*****************************************")
    /*O ArrayInt implementa o foreach , permitindo uso de expressões lambdas*/
    values.forEach {println (it+2)}
    println("*****************************************")
    /*Itera sob cada indice do Array*/
    for (index in values.indices){println(values[index])}
    println("*****************************************")
    /*Organiza de forma crescente - menor to maior*/
    values.sort()
    for(valor in values){println(valor)}
}