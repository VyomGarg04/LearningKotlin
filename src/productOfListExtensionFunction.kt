fun main(){

    val list = mutableListOf<Int>(2,4,6,3,8,4,1,5)
    val product = list.mul()
    print("The product of $list is $product")

}

fun List<Int>.mul(): Int{
    var pro = 1
    for(i in this){
        pro *= i
    }
    return pro
}