fun main(){

    println("Enter the age")
    val age = readlnOrNull()?.toInt()

    when(age){
        in 0..12 -> println("Kid")
        18 -> println("Finally 18")
        in 13..19  -> println("Teen")
        in 20..35 -> println("Young")
        in 36..60 -> println("Adult")
        else -> println("Old")
    }
}