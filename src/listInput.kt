
fun main(){

    var list = mutableListOf<Int>()

    for(i in 1..10){
        var x = readln().toInt()
        list.add(x)
    }
    println(list)
}