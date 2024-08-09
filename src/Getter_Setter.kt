fun main(){
//val car=WeirdCar()
   // car.speed=100
   // println("car.name ${car.name}")
  //  println("car.speed ${car.speed}")

    val account=BankAccount()
    account.account=300
    account.account=400


}

/*
class WeirdCar{
    var name=""
    var speed: Int
        get()=50
        set(value){
            name="High Speed with $value"
        }

}

 */

class BankAccount{
    var creditRating=500
    var account:Int =0
        get()=field
        set(value){
            if(value>account)
                creditRating++
            else
                creditRating--
            field=value
            println("New Credit rating is $creditRating")

        }
}