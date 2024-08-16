fun main(){

val tv=TV()
    tv.getChannel("5")
    tv.getChannel("7",true)
    

}

class TV {
    fun getChannel(id: String){
        println("Regular broadcast for channel $id")
    }

    fun getChannel(id: String , subtitles: Boolean){
        print("Regular broadcast for channel $id")
        if(subtitles)
            println("With subtitles")
        else
            println("Withoud subtitles")
    }

    fun getChannel(id:String,time:Int){
        println("Broadcast for channel $id at $time time")
    }
}