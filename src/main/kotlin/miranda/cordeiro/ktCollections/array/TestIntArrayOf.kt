package miranda.cordeiro.ktCollections

fun main(){
    val  values = intArrayOf(1,2,3,4,5)
    println("*****************************************")
    /*Itera sobre cada valor usando a função foreach*/
    values.forEach {
        println(it)
    }
    println("*****************************************")
    /*Organiza de forma crescente - menor to maior */
    values.sort()
    values.forEach {
        println(it)
    }
    println("*****************************************")
}