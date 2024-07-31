fun main(){
/*
    val colors= listOf("Yellow","red","Black")
    val colors2= listOf<String>()
    println(colors.get(1))
    // changable list
    val colors3= arrayListOf("blue","red","x")
    val noColors= arrayListOf<String>()
    //add elements
    colors3.add("43432")

    //add another collection
    val moreColors= arrayListOf("343")
    colors3.addAll(moreColors)

    colors3.remove("blue")
    colors3.removeAll(moreColors)
   // colors3.remove(1)


 */

    //Practice
    /*
    val animalList= listOf("w232","casdasa","aadsa")
    println(animalList.size)
    println(animalList[1])

    val customerList= arrayListOf("Ali","Reza","Hossein","Baba")
    customerList.add("MAMMAD")
    customerList.add("REX")


     */
    // Ex 1
    /*

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems= listOf("pen","paper","mug","phone")
    println(items.contains("pen"))
    println(items.containsAll(removedItems))
    items.removeAll(removedItems)
    //indexOf
    //LastindexOf = اونایی که داپلیکیت دارن آخرین ایندکسش پیدا میشه

    println(items)


     */
    /*

    val colors= arrayListOf("Blue","Red","Black","Green")
    colors.set(1,"x") // یه ایندکس خاص رو تغییر بدیم به فلان چیز
    colors.subList(1,2) // فقط خونه اول و دوم رو چاپ میکنه
    colors.clear() // پاک کردن کل لیست
    colors.isEmpty() // true


     */
    //Ex 2
    val animals= arrayListOf("Lion","Zebra","Chimp","elephant")
    animals.add("panda")
    println(animals)
    animals.remove("lion")
    println(animals)
    val compareAnimals= listOf("element","giraffe")
    val hasAllAnimals=animals.containsAll(compareAnimals)
    println("Does the zoo have all the animals? : $hasAllAnimals")
}