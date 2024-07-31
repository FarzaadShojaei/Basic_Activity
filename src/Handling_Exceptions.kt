import java.lang.Exception;

fun main(){

    //Practice 1
    /*
 println("Please Enter a Number")
    val input= readLine()
    try {
        val number=input?.toInt()
        println("$number * 5= ${number?.times(5)}")

    }catch (e:Exception){
        println("The Value $input is not True")
    }


     */

// Practice 2
    /*
    println("Enter The Kilometers")

    val input= readLine()
    try {
        val distanceKM=input?.toDouble()
        println("$distanceKM is ${distanceKM?.times(0.62)} miles")
    }catch (e:Exception){
        println("Cannot read distance")
    }

     */

    //Ex
    println("What Products you want to Buy?")
    var input1= readLine()
    println("How many Would you like")
    val input2= readLine()
    val price=9.99
    try {
        val amount=input2?.toInt()
        println("$amount $input1 will Cost ${amount?.times(price)}")
    }catch (e:Exception){
        println("Cannot read amount")
        e.printStackTrace()
    }finally {
        println("Transaction Completed")
    }



}