fun main(){
with(Store1()){
    shoes = 25
    shirts=10
    jackets=43
    printInventory()
}


}


class Store1{
    var shoes=10
    var shirts=20
    var jackets= 30

    fun printInventory(){
        println("The Store has $shoes pairs of shoes, $shirts shirts and $jackets jackets")
    }
}