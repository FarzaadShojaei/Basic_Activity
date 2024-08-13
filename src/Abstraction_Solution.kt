fun main(){
val myOven:DefaultOven=Bosch()
val myRoaster:DefaultOven=Roaster()


}


abstract class DefaultOven{
    val cookingSpeed=120
  open  val averageTemperature= 180

    abstract fun cooking()
}

class Bosch:DefaultOven(){
    override val averageTemperature=210


    override fun cooking() {
        println("Bosch oven is cooking in $cookingSpeed seconds at $averageTemperature")
    }

}

class Roaster:DefaultOven(){
    override fun cooking() {
        println("A roaster roasts at $averageTemperature for $cookingSpeed minutes")
    }
}