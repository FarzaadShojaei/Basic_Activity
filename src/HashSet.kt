fun main(){
    /*
val numbers= hashSetOf(3,7,5,null,7)
val removeElements= hashSetOf(3,4)
    val noNumbers= hashSetOf<Int>()
    println(numbers)
    println(noNumbers)

    numbers.add(44)
    println(numbers)

    val newNumbers= setOf(43,12,78)
    numbers.addAll(newNumbers)
    println(numbers)

    numbers.remove(43)
    println(numbers)
    //numbers.removeAll(removeElements)

     */
    //Practice 1
    /*
    val colors= hashSetOf<String>()
    val addColors= hashSetOf("Blue","Yellow","Green")
    colors.addAll(addColors)
    colors.remove("Blue")
    println(colors)

    val objects= hashSetOf("laptop","mouse","phone","bottle","cup")
    val removeobjects= setOf("cup","bottle")
    objects.removeAll(removeobjects)
    println(objects)

     */
    // Ex 1
    /*
    val customers= hashSetOf("Micheal","Jack","Ali")
    println("Input Name of Joining Customers")
    val customer= readLine()?:"";
    customers.add(customer)

    println("Input Name of Reading Customers")
    val leavingCustomer= readLine()?:""
    customers.remove(leavingCustomer)
    println(customers)

     */
    /*

    val numbers= setOf(3,6,4,null,8)
    println(numbers.size)
    println(numbers.contains(4))
    println(numbers.containsAll(setOf(3,6)))
    println(numbers.isEmpty())

    val numbers1= hashSetOf(3,4,null,83,56)
    val newNumbers= setOf(7,2,5,9,6)
    numbers1.retainAll(newNumbers)
    numbers1.clear()

     */
    val numbers= setOf(2,3,5,7,11,13,17,19,23,19)
    println("Is the number 21 a prime number : ${numbers.contains(21)}")
    
}
