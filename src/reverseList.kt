
fun main() {

    println("Enter 5 numbers")
    var list = mutableListOf<Int>()
    for (i in 1..5) {
        val x = readln().toInt()
        list.add(x)
    }
    println("The 5 numbers in reverse order : ")
    for (i in list.reversed())
        println(i)

}