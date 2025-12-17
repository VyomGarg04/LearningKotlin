

fun main(){

    //rectangle
    println("Shape 1 - Rectangle")
    println("Enter length of the Rectangle")
    val l = readln().toDouble()
    println("Enter breadth of the Rectangle")
    val b = readln().toDouble()

    val myRect = Rectangle(l,b)
    println("Area = ${myRect.area()}")
    println("Perimeter = ${myRect.peri()}")
    if(myRect.isSquare()) println("Rectangle is a square")
    else println("Rectangle is not a square")

    println("-------------------------------------------------------------------")
    //circle
    println("Shape 2 - Circle")
    println("Enter radius of the Circle")
    val r = readln().toDouble()
    val myCircle = Circle(r)
    //all print lines are initialized in the init in circle class

}