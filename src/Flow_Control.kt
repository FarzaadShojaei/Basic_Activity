fun main(){
println("Input a boolean value. Is it night time?")
    val input= readLine()
    val night=input.toBoolean()
    if(night){
        println("Sleep, it's night time")
    } else{
        println("Be active, It's day time")
    }

    
}