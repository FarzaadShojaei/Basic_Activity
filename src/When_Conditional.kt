fun main(){
    /*
    var animal="cat"
    var action:String=""
    when(animal){
        "cat" ->{
            action="Pet it"
        }
        else -> "peti it"



    }
println("When you meet an $animal you should do $action")


     */
    /*
    val animal="cat"
    val action=when(animal){
        "cat" -> "feed it"
        "dog","Mouse"->{
            "God it"
        }
        else -> "Google it"

    }

     */
    /*

    val name="Mitchelle"
    when(val length=name.length){
        in 1..5 -> println("A name with $length characters is short")
        else -> println("A name with $length is long")
    }

     */
    //Practice 1
    /*
    println("Write the number of meals you have everyday")
    val input= readLine()?:"3"
    val meals=input.toInt()
    val action=when(meals){
        in 0..2 -> println("More")
         3 -> println("Less")
        else -> println("Adding Less is bad")
    }

     */
/*
    //Practice 2
    println("What is the currenct hour? (0-23)")
    val input= readLine()?:"0"
    var hour=input.toInt()
    if(hour > 23) hour=23
    val timeOfDay=when(hour){
        in 6..11 -> "Morning"
        in 12..14 -> "Noon"
        else -> "night"


    }
    println("At $hour:00 it's $timeOfDay")



 */

    //Ex
    println("Enter the Name ")
    val input= readLine()?:""
    val greetedName=input.toString()
    when(greetedName[0]){
        'A','B','C' -> println("Hello $greetedName, w")
        in 'D' .. 'F' -> println("Hi $greetedName How you doin")
        else -> println("Hi")

    }
}




