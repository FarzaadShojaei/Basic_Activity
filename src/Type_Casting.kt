import kotlin.random.Random

fun main() {
    val animals = getAnimals()
    animals.forEach { animal ->

    (animals as? Dog)?.bark()
    (animals as? Cat)?.purr()
}


}

abstract class Animal

class Dog1 : Animal(){
    fun bark(){
        println("Dog is Barking")
    }
}

class Cat : Animal(){
    fun purr(){
        println("Cat is purring")
    }
}

fun getAnimals(): ArrayList<Animal> {
    val animals = arrayListOf<Animal>()
    for (i in 1..20) {
        animals.add(
            if (Random.nextInt() % 2 == 0)
                Dog1()
            else
                Cat()
        )
    }
    return animals
}


