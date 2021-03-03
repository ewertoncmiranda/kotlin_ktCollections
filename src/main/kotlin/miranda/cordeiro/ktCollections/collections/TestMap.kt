package miranda.cordeiro.ktCollections.collections

fun main(){
    val pair:Pair<String,Double> = Pair("Tomas",1000.00)

    val map1 = mapOf(pair)

    map1.forEach{(k,v) -> println("Chave: $k ,Valor: $v")}
    
    val map2 = mapOf(
        "Pedro" to 2.500 ,
        "Maria" to 3.000,
        "Roberto" to 5.500)
    println("******************************************************")
    map2.forEach{(k,v) -> println("Chave : $k , Valor : $v")}



}