

fun main(){

    var triple = Triple<Int, String, Boolean>(3,"hello",true)


    var customTriple = customTriple<Int, String, Boolean>(3,"hello",true)
    customTriple.printTypes()
}