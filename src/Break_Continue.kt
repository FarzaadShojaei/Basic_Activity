fun main(){
    /*
var onlyEvenNumbers= arrayListOf(2,6,4,7,8,10)
    for(number in onlyEvenNumbers){
        if(number %2 !=0){

        }
    }

     */
    /*
    loop@for(i in 1..10){
        for(j in 1..10){
            if(i % 3 ==0)
                continue@loop

            println("$i,$j")
        }
    }




     */

    //Ex 1

    while (true) {
        println("Please Enter your age")
        val input = readLine() ?: ""
        if (input == "stop")
            break

        val age = input.toInt()
        if (age < 18) {
            println("Sorry You cannot go it")
            continue
        }
        println("Welcome to the club")

    }
}