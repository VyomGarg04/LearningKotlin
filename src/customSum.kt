

fun main(){

    var list = (1..10).toList()
    println(list)

    list = list.filter { it % 2 == 1 }
    println(list)

    val sum  = list.customSum { it % 2 == 1}
    println("Sum = $sum")


}

fun List<Int>.customSum(filterFunction: (Int) -> (Boolean)): Int {
    
    var sum=0
    for (i in this) {
        if (filterFunction(i))
            sum += i

    }
    return sum
}