package miranda.cordeiro.ktCollections

import java.lang.reflect.Array

fun main(){
    val names = Array(3){""}
    names[0]="Tomas34"
    names[1]="Tomas13"
    names[2]="Tomas9"
    println("*****************************************")
    for(name in names){ println(name) }
    names.sort()
    println("*****************************************")
    names.forEach { println(it) }
    println("*****************************************")
    val names2 = arrayOf("Maria" ,"Tomas" , "Zelia" , "Katia")
    names2.sort()
    names.forEach { println(it) }
    println("*****************************************")
}