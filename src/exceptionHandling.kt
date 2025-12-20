
fun main(){

    println("Enter a number : ")
    val input = try{
        readlnOrNull()?.toInt()
    }catch (e: NumberFormatException){
        0
    }finally {
        println("This is from finally block")
    }
}


//creating own exception

class DivisionByZeroException : Exception("You cannot divide a number by zero, enter another number")


fun divide(a: Double,b: Double): Double{
    if(b==0.0){
        throw DivisionByZeroException()
    }
    return a/b
}