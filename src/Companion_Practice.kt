import kotlin.coroutines.CoroutineContext
import kotlin.random.Random
fun main(){
val correctKey=Lock.createKey()
    val myLock=Lock(correctKey)

    val randomKey=Lock.createKey()
    myLock.unlock(randomKey)


}


class Lock(key:Key){
    val secretCode: String
    init {
        secretCode=generateSecrect()
        key.secretCode=secretCode
    }
    companion object{
        fun createKey()=Key()
    }

    fun generateSecrect(): String{
        return  Random(System.currentTimeMillis()).nextInt().toString()

    }

    fun unlock(key:Key){
        if(key.secretCode == secretCode)
            println("Lock is open")
        else
            println("Key is not correct")
    }
}

class Key{
    var secretCode: String= ""

        set(value){
            if(field == "")
                field =value
        }
}