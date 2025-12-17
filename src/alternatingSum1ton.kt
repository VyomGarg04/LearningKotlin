

fun main(){
    println("Enter a number")
    val n = readln().toInt()
    val sum = alternatingSum(n)

    println("The alternating sum from 1 to $n is $sum")
}

fun alternatingSum(n:Int):Int{
    var sum =0
    var j=0
    for(i in 1..n){
        if(j%2==0)
            sum += i
        else
            sum -= i
        j++
    }
    return sum
}