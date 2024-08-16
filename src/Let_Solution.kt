fun main(){
    val clients= arrayListOf<String?>()

    do {
        println("Enter Client Name")
        val input= readLine()
        input?.let{
            if(it == "")
                clients.add(null)
            else
                clients.add(it)


        }

    }while (input?.toLowerCase() != "stop")
    println(clients)

    clients.forEach{
        it?.let {
            println("Hello $it")
        }
    }

}