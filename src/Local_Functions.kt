fun main(){

    printGreeting()

//listAnimals()
    //Practice:
//takingAMap(hashMapOf(Pair("Alice",546.0),Pair("Bob",545.0),Pair("Charlie",545.0)))

    //Ex 1

}

/*
fun listAnimals(){
    fun listOneAnimal(animal:String){
        println("I have $animal")
    }

    val animals= listOf("cat","dog","giraffe")

    for(animal in animals){
        listOneAnimal(animal)
    }
}

 */
//Practice:
/*
fun takingAMap(users:HashMap<String,Double?>){
    fun doubleAmount(amount:Double?)=amount?.times(2)

    println(users)
    for(user in users.keys){
       users[user]=doubleAmount(users[user])
    }
    println(users)
}

 */

//Ex 1

fun printGreeting(){
fun sayHi(name:String){
    println("Hi $name how are you")
}
    while (true){
        println("Please Enter a Name")
        val name= readLine()?:""
        if(name== "")break
        sayHi(name)
    }
}