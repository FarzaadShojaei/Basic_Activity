fun main(args: Array<String>) {
    val myCar = Car4()
    myCar.drive()
}

class Car4 {
    private val engine = Engine()
    var speed = 100
    fun drive() {
        engine.run()
        println("Driving at $speed")
    }

    private inner class Engine {
        val rpm = 1000
        fun run() {
            println("Engine is running at $rpm rpm")
            this@Car4.speed = 50
//            this@Car3.drive()
        }
    }
}