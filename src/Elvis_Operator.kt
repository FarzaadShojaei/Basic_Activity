fun main(args: Array<String>){

var catName: String?=null
    println(catName?:"Hello".length)

    val dogName:String?=null
    println(dogName!!.length)

    val message= readLine();
    println(message?:"Hi There")


    //Practice
    val number= readLine();
    val b=number?.toInt()
    println("$b multiplied by 5 is ${b!! * 5}")


    //Exercise
    val productPrice=29.99;
    println("How many Products you want to Buy?")

    val ProductNumber= readLine()
   val purchasedProduct= ProductNumber?.toInt()?:3;

    println("The Total Purchase is ${purchasedProduct * productPrice }")
}