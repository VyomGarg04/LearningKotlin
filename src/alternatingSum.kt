fun alternatingSum(vararg numbers: Int):Int{
    var sum = 0
    var j=0
    for(i in numbers){
        if(j%2==0)
            sum += i
        else
            sum -= i
        j++
    }
    return sum
}
fun main(){
    val arr = intArrayOf(261,84,3,1,45)

    val sum = alternatingSum(1,2,3,5,7,9,*arr,13,6,3,2,93)

    println("The alternating sum of the numbers is : $sum")
}