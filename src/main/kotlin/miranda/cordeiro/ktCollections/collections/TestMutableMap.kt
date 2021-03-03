package miranda.cordeiro.ktCollections.collections

fun main(){

    val dog = Animal("Dog",50.00, "A")
    val cat = Animal("Cat",21.00, "A")
    val cow = Animal("Cow",100.00, "A")
    val shark = Animal("Shark",250.00, "B")
    val bird = Animal("Bird",1.00, "B")
    val fish = Animal("FIsh", 0.50, "B")

    val repository = Repository<Animal>()

    repository.create(dog.groupAnimal , dog)
    repository.create(shark.groupAnimal , shark)

    repository.findAll().forEach{println(it)}

    print(repository.findById("A"))

}

class Repository<T>{

    private val mapDataBase = mutableMapOf<String,T>()

    fun findAll() = mapDataBase.values

    fun create(id:String ,value:T){
        mapDataBase[id] = value
    }
    fun findById(id:String)=mapDataBase[id]
}