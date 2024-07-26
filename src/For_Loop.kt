fun main(){
    /*
val animals= arrayListOf("Cat","Dog","Mouse","Ant")
    for(animal in animals){
        println("Feed the $animal")
    }

    for(i in 1..12){
        val month=when(i){
            1->"January"
            else -> "Nothing"
        }
    }



     */
    /*

 val customers= hashMapOf(Pair("Alice",4),Pair("Judy",8),Pair("Anna",7))
    for(customerName in customers.keys){
        val purchases=customers[customerName]
        println("$customerName you purchased $purchases items")

    }


     */
    /*

    for(i in 1..12){
        val message=when(i){
            1->"Jaunary"
            2->if(year %4 ==0) "February has 29 days" else "February has 28 days"

            else->""
        }
    }

     */
    /*
    for (i in 10 downTo 0 step 3){
        println(i)
        when(i){
            6->"Six"
            else->"Nothing"
        }
    }

     */
    /*
    val matrixSize=10
   for(i in 0..matrixSize){
       for(j in 1..matrixSize){
           if(i==j){
               println("diagonal\t")
           } else{
               println("$i,$j   \t\t")
           }

       }
   }

     */

    //Ex 1
    println("Please enter the matrix size")
    val input= readLine()?:""
    val size=input.toInt()

    for(i in 1..size){
        for(j in 1..size){
            when(i*j%3){
                0-> print("\uD83D\uDE00\t")
                1->print("\uD83E\uDD28\t")
                2 ->print("\uD83D\uDE31\t")
            }
        }
        println()
    }


}
