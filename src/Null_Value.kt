


fun main(){

  val myName:String="X"
    val theName:String?=null

  val a: String?="Srwq23";
  println(a?.substring(3,6))

  var b: Double?=330.2;
  b=b?.times(6)
  println(b?.toFloat())

  val username: String?= readLine()
  println(username?.length)

  // Exercise

  val practiceNumber= readLine();
 val number=practiceNumber?.toDouble()?.times(7)
  println("Length of $number is ${number?.toString()?.length}")


}