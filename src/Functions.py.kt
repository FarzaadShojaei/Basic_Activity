fun main(){
    println("Please Enter an Animal")
    val animal= readLine()?:""
    val lifespan=getlifespan(animal)
    println("a $animal has $lifespan lifes")

    /*
    for(i in 1..3){
        sayHello()
    }
    var i=5
    do {
        i--
        printAlphabet()
    } while (i >0)



}
fun sayHello(){
    println("Hello")
}

fun printAlphabet(){
    print("a,b,c,d,e,f,g,i")


     */
    /*
    for (i in 1..10){
        sayHello()
    }
}

fun sayHello(){
    println("Hello")

     */
    /*

    fun sayHello(people:Collection<String>){
        for(person in people){
            println("Hello $person")
        }
    }

    fun doubleMessage(number:Int,message:String="The Message is"){
        println("$message ${number *2}")
    }

     */

/*

    fun personalizedGreeting(person:String):String{
        val greeting=when(person[0]){
            'A' -> "Are You OK $person"
            'B' -> "What's up $person"
            else -> "Hey There"
        }
        return greeting
    }

    fun calculateSimulateArea(radius:Int)=3.4*radius*radius;

 */

    //Ex


}

fun getlifespan(name:String):Int{
    val lifespan=when(name){
        "cat" -> 15
        "dog" -> 20
        "fish" -> 25
        else -> 0

    }
    return lifespan
}