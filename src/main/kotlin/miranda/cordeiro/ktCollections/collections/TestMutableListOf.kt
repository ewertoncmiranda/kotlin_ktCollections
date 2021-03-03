package miranda.cordeiro.ktCollections.collections

fun main(){
    val dog = Animal("Dog",50.00, "A")
    val cat = Animal("Cat",21.00, "A")
    val cow = Animal("Cow",100.00, "A")
    val shark = Animal("Shark",250.00, "B")
    val bird = Animal("Bird",1.00, "B")
    val fish = Animal("FIsh", 0.50, "B")

    val animalAList = mutableListOf<Animal>(dog , cat ,bird)
    val animalBList = mutableListOf<Animal>(shark ,fish ,cow)
    println("*************************************")
    animalAList.forEach{ println(it)}

    println("*************************************")
    animalBList.forEach{ println(it)}

    println("*************************************")
    animalAList.remove(cat);
    println(animalAList)

    println("*************************************")
    animalAList.add(shark);
    println(animalAList)

    println("*************************************")

    animalAList.removeAt(0);
    println(animalAList)





}