//Object Construct
//A class can be instaitiated the instance is called an object
//Methods and variables inside it can be accessed without an instacne
//Singleton - One instance of a class

fun main(args:Array<String>){
    DatabaseAccess.connected=true
    if(DatabaseAccess.connected){
        DatabaseAccess.disconnect()
    } else{
        DatabaseAccess.connect()
    }
}


object DatabaseAccess{
    var connected=false
    fun connect(){
        connected=true
        println("Connected")
    }
    fun disconnect(){
        connected=false
        println("Disconnected")
    }
}


//Collections and Lists are interfaces