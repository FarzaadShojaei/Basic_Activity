fun main(args: Array<String>){

}

open class Job{
    var name= "Generic Job"
    var revenue=0
    var salary=10000

    fun work(){
        revenue +=salary
        println("$name revenue $revenue")
    }
    fun study(){
        salary +=5000
        println("$name salary $salary")
    }


}

class Engineer:Job(){

}

class Doctor:Job(){

}