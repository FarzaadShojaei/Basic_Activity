fun main(){
Laptop2().run {
    turnOff()
    turnOn()
}


}


class Laptop2{
    fun turnOff(){
        println("Turning Laptop Off")
    }

    fun turnOn(){
        println("Turning Laptop ON")
    }
}