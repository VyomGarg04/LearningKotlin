

fun main(){
    println("Enter an input")
    val userInput = readlnOrNull()



    if(userInput == null){//cannot check condition with readln()
        println("No input received")
    }
    else{
        println("Your input is $userInput")
        println("${userInput.toInt()} - 5 = ${userInput.toInt() - 5}")
    }







}