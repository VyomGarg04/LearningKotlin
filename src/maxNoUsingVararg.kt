

fun getMax(vararg numbers: Int):Int{
    var max = numbers[0]
    for(number in numbers){
        if(max<number){
            max = number
        }
    }
    return max
}
fun main(){
    val arr = intArrayOf(26,84,99,3,45)

    val max = getMax(1,2,3,5,7,9,*arr,13,6,3,2,93)

    println("The maximum number is : $max")
}