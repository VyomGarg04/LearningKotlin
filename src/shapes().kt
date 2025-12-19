

fun main(){

    //rectangle
    println("Shape 1 - Rectangle")

    val myRect1 = Rectangle(6.0,3.5)
    val myRect2 = Rectangle(6.0)
    val myRect3 = Rectangle(3,4)
    println("Area = ${myRect1.area()}")
    println("Perimeter = ${myRect1.peri()}")
    if(myRect1.isSquare()){
        println("Rectangle is a square")
        myRect1.changeName("Square")
        println("New name of the shape - ${myRect1.name}")
    }
    else println("Rectangle is not a square")

    println("-------------------------------------------------------------------")
    //circle
    println("Shape 2 - Circle")
    println("Enter radius of the Circle")
    val r = readln().toDouble()
    val myCircle = Circle(r)
    //all print lines are initialized in the init in circle class

    println("-------------------------------------------------------------------")
    //triangle
    println("Shape 3 - Triangle")
    println("Enter three sides of the Triangle")
    println("Enter side 1")
    val s1 = readln().toDouble()
    println("Enter side 2")
    val s2 = readln().toDouble()
    println("Enter side 3")
    val s3 = readln().toDouble()
    val myTriangle = Triangle(s1,s2,s3)
    //all print lines are initialized in the init in circle class

}