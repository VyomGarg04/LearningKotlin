
fun sum(n:Int){
    var sum =0
    for(i in 1..n){
        sum +=i
    }
    println("The sum of first $n natural number is $sum")
}

fun main(){
    println("Enter a number")
    val n = readln().toInt()

    sum(n)
}