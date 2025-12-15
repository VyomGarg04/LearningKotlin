

fun printPow(base: Int, exponent: Int){
    var result = 1
    for(i in 1..exponent){
        result *= base
    }
    println("$base to the power $exponent is $result")
}

fun main(){
    println("Enter base")
    val base = readln().toInt()
    println("Enter exponent")
    val exponent = readln().toInt()
    printPow(base, exponent)
}