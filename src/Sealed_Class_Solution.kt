import kotlin.random.Random

fun main(){
    for(i in 1..10) {
        val prize = lottery()
        when (prize) {
            is Vacation -> println("I'm going on holiday")
            is Car3 -> println("Wow I Won a car")
            is GitCard -> println("Wow I won a giftcard")
        }
        }



}

fun lottery():Prize{
    val number= Random.nextInt(3)
    return when(number){
        0 -> FranceHoliday()
        1 -> VW()
        else -> Dollar10()
    }
}



sealed class Prize
sealed class Car3:Prize()
sealed class Vacation:Prize()
sealed class GitCard:Prize()

class VW:Car3()

class FranceHoliday: Vacation()

class Dollar10:GitCard()