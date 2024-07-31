fun main(){
    /*
    if(326/72*15==62){
        println("Math is easy")
    }else{
        println("Math is Hard")
    }

    val favouritePet="dog"
    val availablepets= listOf("dog","cat","horse")

    if(favouritePet !in availablepets){
        println("Is Not Existed")
    } else{
        println("Is existed")
    }
//Boolean Functions= A function can be used  in a conditional statement if it returns a boolean

    val animals= arrayListOf<String>("cat")
    if(animals.isEmpty()){
        animals.add("dog")
    }
    println(animals)

    val animals1= arrayListOf<String>("cat","dog")
    if(animals1.add("horse")){
        println("Horse was successfully added")
    }
    println(animals1)



     */
val guestlist= setOf("John","Alice","Bob","Caro")
    val guest= readLine()?:""
    if(guest in guestlist){
        println("Hi $guest")
    }
    val input= readLine()?:"0"
    var cats = input.toInt()
    val howMany=if(cats==0)
            "no cats"
      else if(cats in 1..3)
            "few cats"
    else if(cats in 4..6)
        "several cats"
    else if(cats==123)
        cats=142
    else
        "many cats"
    println("This lady has $howMany")

}