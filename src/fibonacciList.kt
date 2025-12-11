

fun main(){

    println("Enter number of elements to print")
    val n = readln().toInt()
    var list = mutableListOf<Int>()
    var a = 0
    var b = 1
    list.add(a)
    for(i in 0..n){
        list.add(b)
        b=a+b
        a=b-a
    }
    print(list)
}