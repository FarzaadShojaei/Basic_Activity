fun main(){
// Inheritance: a class inherits from another class
    val myDoggy=Corgi()
    myDoggy.size=10
    myDoggy.bark()
}

open class Dog{
    var size=0

    fun bark(){
        println("Bark")
    }
    fun play(){
        println("Play")
    }
}

class Corgi:Dog(){

}