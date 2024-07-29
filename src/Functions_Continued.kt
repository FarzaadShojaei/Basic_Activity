fun main(){
    sayHello("Alice","Bob","Carol","Dan","Fiona","Eric")
    /*

cost("coffe",4.99)
val products= mapOf(Pair("cake",3.99),Pair("can of soda",1.50))

     */
}

fun sayHello(vararg names:String){
    for(name in names){
        println("Hello $name")
    }
}

/*
fun cost(product:String,price:Double?){
    println("A $product costs ${price?.times(1.2)}")
}
fun cost(products:Map<String,Double>){
    for(product in products.keys){
        cost(product,products[product])
    }


}

 */




/*
fun multiply(number:Int) = number *2
fun multiply(number: Int, multiplier:Int)=number *multiplier
fun sayHello(person:String){
    println("Hi $person")
}

fun sayHello(people:Collection<String>){
    for (person in people){
        println("Hi there $person")
    }

 */



