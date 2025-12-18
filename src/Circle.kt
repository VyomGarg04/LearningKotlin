class Circle(
    val rad: Double
):Shape("Circle") {

    private val pi = 3.141592 //cannot access the value of pi outside this class

    init{
        println("$name created with radius =$rad")

        println("Diameter of the $name = ${diameter()}")
        println("Area of the $name = ${area()}")
        println("Perimeter of the $name = ${peri()}")
    }

    fun diameter() = 2*rad

    fun area() = rad*rad*pi

    fun peri() = 2*rad*pi
}