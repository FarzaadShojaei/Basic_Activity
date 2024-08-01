fun main(args:Array<String>){
   // val names:ArrayList<String> = arrayListOf("Alice","Bob","Carol","Dan")
  //  val myLambda:(String) -> Unit={name:String -> println("Hello there $name") }
//sayHello(names,myLambda)

    //Practice
    /*
    val numbers:ArrayList<Int> =arrayListOf(3,8,6,5,435,56,34,768,45)
    println(numbers)
  val newNumbers:ArrayList<Int> =update(numbers){number->number/10}
  println(newNumbers)

     */

    //Exersice
    val clients:ArrayList<String> = arrayListOf("Micheal","Jane","Dan","Michelle")
    val messages:ArrayList<String> = getMessages(clients){name -> "Hello $name how are you"}
    println(clients)
    println(messages)
    for(i in 0..clients.size-1){
        println("Message for ${clients[i]}")
        println(messages[i])

    }
}
/*
fun sayHello(names:ArrayList<String>,doSomething:(String)->Unit){
    for(name:String in names){
        doSomething(name)
    }
}

 */
//Practice
/*
fun update(numbers:ArrayList<Int>, lbd:(Int)->Int):ArrayList<Int>{
    for(i in 0..numbers.size-1){
        if(numbers[i] % 2 ==0){
            numbers[i]=lbd(numbers[i])
        }
    }
    return numbers
}

 */

//Excersice
fun getMessages(clients:Collection<String>, getMessage:(String)-> String):ArrayList<String>{
    val messages:ArrayList<String> = arrayListOf<String>()
    for (client:String in clients){
        messages.add(getMessage(client))
    }
    return messages
}