fun main(){
lateinit var message: String
val primeNumbers= listOf(2,3,5,7,11,13,17,23)
    message="The Chosen prime number is ${selectPrimeNumber(primeNumbers)}"
    println(message)


}

fun selectPrimeNumber(primes: List<Int>)= primes.random()

