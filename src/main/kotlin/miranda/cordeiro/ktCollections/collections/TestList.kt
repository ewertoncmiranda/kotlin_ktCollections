package miranda.cordeiro.ktCollections.collections

fun main(){
    /* Listas*/

    /* Criação e atribuição de valores a variaveis de Animal*/
    val dog = Animal("Dog",50.00, "A")
    val cat = Animal("Cat",21.00, "A")
    val cow = Animal("Cow",100.00, "A")
    val shark = Animal("Shark",250.00, "B")
    val bird = Animal("Bird",1.00, "B")
    val fish = Animal("FIsh", 0.50, "B")
    val animalList = listOf<Animal>(dog , cat ,bird,shark ,fish ,cow)

    animalList.forEach{println(it)}

    /*  a função find permite encontrar objetos comparados a parametros definidos*/
    println(animalList.find { it.name == "Dog" })

    println("*********************************************************")
    /* A função sorted by permite organizar por ordem crescente , e foreach executa
    * a acao final da variavel tratada.*/
    animalList.sortedBy { it.weight }
              .forEach{println(it)}

    println("*********************************************************")
    /* GroupBy agrupa os objetos em grupos de true e false , de acordo com a condição definida*/
    animalList.groupBy{ it.groupAnimal == "B" }
              .forEach{println(it)}
    println("*********************************************************")
    /* GroupBy agrupa os objetos em grupos de true e false , de acordo com a condição definida*/
    animalList.groupBy{ it.groupAnimal == "A" }
        .forEach{println(it)}
    println("*********************************************************")


}
/*Data Class são POJOs*/
data class Animal(val name:String , val weight:Double ,val groupAnimal:String){
    override fun toString(): String = " Nome : $name , Weight: $weight , Group: $groupAnimal".trimIndent()
}