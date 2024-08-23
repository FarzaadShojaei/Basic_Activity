fun main(){
    val list= arrayListOf(3,7,5,6,8,7,9,6,4,2,5)
    println(list.howMany())
    Double.printClassName()
}

fun ArrayList<Int>.howMany()="This List contains $size elements"

fun Double.Companion.printClassName(){
    println("This is a Double class")
}