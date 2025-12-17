class Circle(
    val rad: Double
) {

    val pi = 3.141592

    init{
        println("Circle created with radius =$rad")

        println("Diameter of the Circle = ${diameter()}")
        println("Area of the Circle = ${area()}")
        println("Perimeter of the Circle = ${peri()}")
    }

    fun diameter() = 2*rad

    fun area() = rad*rad*pi

    fun peri() = 2*rad*pi
}