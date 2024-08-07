fun main(){

val myLaptop=Laptop()
val myApple=Apple()
}


open class Laptop{
    var screenSize=15
    var speed=1200
    var name="Generic Laptop"

    fun run(){
        println("screnn size $screenSize")
    }
}

class Apple:Laptop(){}