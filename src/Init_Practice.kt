fun main(args: Array<String>){
    val newLaptop = Laptop1("Windows 10")
}

class Laptop1(val operatingSystem: String){
    init {
        println("Operating system $operatingSystem is installing")
    }
}