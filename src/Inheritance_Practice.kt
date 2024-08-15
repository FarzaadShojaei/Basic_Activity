fun main(){

val myLaptop=Laptop("Windows 10")
val myApple=Apple()
}


open class Laptop(s: String) {
    var screenSize=15
    var speed=1200
    var name="Generic Laptop"

    fun run(){
        println("screnn size $screenSize")
    }
}

class Apple:Laptop("Windows 10") {}