package miranda.cordeiro.ktCollections

fun main(){
    val paymentList = doubleArrayOf(1000.00 ,2500.00 , 3000.00 ,5000.00 , 7000.00)

    println("*****************************************")

    println("Maior Salario : "+ paymentList.maxOrNull())
    println("Menorr Salario : "+ paymentList.minOrNull())
    println("Média Salarial : "+ paymentList.average())


    /*O filter filtra os itens que atendem a expressão , atribuindo esses itens
    a um novo array.*/
    val paymentBiggerThan3000 = paymentList.filter { it >= 3000 }
    paymentBiggerThan3000.forEach{ println(it)  }

    println("*****************************************")

    /*o count faz a contagem de elemento que satisfaçam a expressao pasasda.
    * no exemplo , são contados apenas os elementos -it- que estão no range
    * entre 2999.00 e 7000.00*/
    println(paymentList.count{ it in 2999.00..7000.00 })

    println("*****************************************")
    /*retorna o elemento que atenda a expressão passada. aconselhado
    * utilizar para igualdades*/
    println(paymentList.find { it == 5000.00 })

    println("*****************************************")
    /*retorna um booleano atendendo a expressão passada*/
    println(paymentList.any { it > 7000.00 })
    }