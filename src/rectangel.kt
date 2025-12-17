

fun main(){
    println("Enter length of the Rectangle")
    val l = readln().toDouble()
    println("Enter breadth of the Rectangle")
    val b = readln().toDouble()

    val myRect = Rectangle(l,b)
    println("Area = ${myRect.area()}")
    println("Perimeter = ${myRect.peri()}")
    if(myRect.isSquare()) println("Rectangle is a square")
    else println("Rectangle is not a square")
}