package miranda.cordeiro.ktCollections.collections

fun main(){
    val dog = Animal("Dog",50.00, "A")
    val cat = Animal("Cat",21.00, "A")
    val cow = Animal("Cow",100.00, "A")
    val shark = Animal("Shark",250.00, "B")
    val bird = Animal("Bird",1.00, "B")
    val fish = Animal("FIsh", 0.50, "B")

    var animalASet = setOf<Animal>(dog ,cat ,cow)
    var animalBSet = setOf<Animal>(shark ,bird, fish)
    animalBSet.forEach{println(it)}

    println("***********************************************")
    animalASet.forEach{println(it)}

    println("***********************************************")
    val resultUnion = animalASet.union(animalBSet)
    resultUnion.forEach{println(it)}

    println("***********************************************")
    val resultAnimal = resultUnion.subtract(animalASet)
    resultAnimal.forEach{ println(it)}

    println("***********************************************")

    val resAnimal2 = resultUnion.intersect(animalASet)
    resAnimal2.forEach{ println(it)}
}