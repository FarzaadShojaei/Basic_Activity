fun main(){
val myBox=Box()
    println("Contents is ${myBox.contents}")
    myBox.updateContents("Jewellery")
    println("Content is ${myBox.contents}")


}

class Box{
    var contents:String = ""

    fun updateContents(contents: String){
        this.contents=contents;
    }
}