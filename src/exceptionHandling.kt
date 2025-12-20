//import java.lang.Exception
//import java.lang.NumberFormatException

fun main(){
//    println(divide(5.0,0.0))
    val division = try {
        divide(5.0,0.0)
    }catch (e: DivisionByZeroException){
        0.0
    }
    println("The result of division is $division")


    println("Enter a number : ")
    val input = try{
        readlnOrNull()?.toInt()
    }catch (e: NumberFormatException){
        0
    }finally {
        println("This is from finally block")
    }
    println("You entered $input")
}


//creating own exception

class DivisionByZeroException : Exception("You cannot divide a number by zero, enter another number")


fun divide(a: Double,b: Double): Double{
    if(b==0.0){
        throw DivisionByZeroException()
    }
    return a/b
}