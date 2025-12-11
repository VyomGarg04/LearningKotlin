

fun main(){
    println("Enter 5 numbers")
//    val a = readln().toInt()
//    val c = readln().toInt()
//    val b = readln().toInt()
//    val d = readln().toInt()
//    val e = readln().toInt()
    var avg:Float = 0.0f
    for(i in 1..5){
        var input = readln().toInt()
        avg += input/5.0f
    }

//    val avg = (a+b+c+d+e)/5
    println("Average value is $avg")

}