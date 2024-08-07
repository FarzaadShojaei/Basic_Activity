fun main(){

val mycar: Car=Car()
    mycar.model="sda"
val yourCar:Car=Car()
    yourCar.start()
    mycar.drive()
}

class Car{
    var model: String?=null
    var topSpeed=100

    fun start(){
        println("Printing the $model")
    }
    fun drive(){
        println("Printing the $topSpeed")
    }
}

class Math{
    fun add(a:Int, b:Int) = a+b

}

