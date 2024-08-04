fun main(){
    //val client:List<String> = listOf("Alice","Bob","Carol","Dan")
   // client.forEach{println("Hello $it")}
    // it refers to the element that is currently being used
    //client.filter { it.length <5 }
       // .forEach{println("Hello $it")}

    //Practice
    /*
    val numbers:Set<Int> = setOf(3,456,34,67,4,567,34,6575)
    println(numbers.filter { it in 10..99 })

    val clients:List<String> = listOf("Tom","Laura","Dennis","Mark")
    println(clients.sortedBy { it[it.length-1] })

    val ints:List<Int> = listOf(372,285,836,194,836,216)
    println(ints.maxBy { it.toString()[1].toInt() })
    println(ints.maxBy { it/10 % 10 })


     */

    //

//val sizes:List<Int> = client.map { it.length }
//println(sizes)
  //  val sorted=client.sortedBy { it.length }
  //  println(sorted)
   // val max=client.maxBy { it.length }
   // println(max)
   // val min:String?=client.minBy { it.length }
  //  println(min)


    //Excersice
    val numbers:List<Int> = listOf(34,67,76,45,3435,345,67,23,5,3,56)
    val subset:List<Int> = numbers.map {
        if(it % 2 ==0)
            it /2
        else
            it *2



    }
        .filter { it > 25 }

    println(subset)

}