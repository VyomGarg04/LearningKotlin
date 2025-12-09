

fun main(){

    val myArr = arrayOf(8,6,4,0,2,10,54,24,84,93,46)
    var max = myArr[0]
    for(i in myArr){
        if(i>max){
            max=i
        }
    }
    println(max)
}