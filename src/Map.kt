fun main(){
    /*

val count= mapOf(Pair(1,"one"),Pair(2,"two"),Pair(3,"three"))
    println(count)

    val count2= mapOf<Int,Int>()

    println(count[2])
    println(count2)
    println(count.keys)
    println(count.values)

     */
    /*

    val count= hashMapOf(Pair(1,"one"), Pair(2,"two"),Pair(3,"three"))
    count.put(5,"five")
    println(count)

    val countMore= mapOf(Pair(20,"twenty"),Pair(30,"Thirty"))
    count.putAll(countMore)
    println(count)
    count.remove(2)
    count.replace(1,"x")
    println("Size is : ${count.size}")
    println("Has Key 2? : ${count.containsKey(2)}")
    println("Has Value \"one\"${count.containsValue("one")}")
    println("Is it Empty ${count.isEmpty()} ")

     */
    //Practice Ex 2
    /*
    var count=hashMapOf(Pair(1,"un"), Pair(2,"deux"),Pair(3,"trois"))
    println("2 is French of ${count[2]}")
    count.put(4,"quatre")
    var customers= mapOf(Pair("John",1),Pair("Alice",5),Pair("Bob",3))
    println("Is alice a Customer?: ${customers.containsKey("Alice")}")
    println("Alice bought ${customers.get("Alice")} products ")
    println("")



     */

    // Ex 3
    var attendance = hashMapOf<String,Int>(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance.put("26 Sept",6341)
    val peopleOn25=attendance["25 Sept"]?:0
    val peopleOn26=attendance["26 Sept"]?:0
    println("Is data for 22 September avaliable ${attendance.containsKey("22 Sept")}")
    println("People on the 25 and 26 of Sept ${peopleOn25+peopleOn26}  ")
    println(attendance)

}