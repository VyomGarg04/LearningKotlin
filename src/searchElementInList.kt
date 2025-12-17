

fun search(list: List<Int>,num:Int):Int{
    for(i in 1..list.size-1)
        if(list[i]==num)
            return i
    return -1
}

fun main(){
    println("Enter a number to search")
    val num = readln().toInt()
    val list = listOf(0,1,2,3,4,5,6,7,8,9)
    val result = search(list,num)
    if(result == -1)println("Number not found")
    else println(result)
}
