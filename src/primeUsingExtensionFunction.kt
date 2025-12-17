

fun main(){
    println("Enter a number to check whether it is prime or not")
    val input = readlnOrNull()?.toInt()
    if(input!=null){
        if(input.isPrime())
            println("$input is a prime number")
        else
            println("$input is not a prime number")
    }
}

fun Int.isPrime(): Boolean{
    for(i in 2 until this/2){
        if(this%i == 0) return false
    }
    return true
}