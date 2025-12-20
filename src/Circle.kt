class Circle(
    val rad: Double
):Shape("Circle") {



    init{
        println("$name created with radius =$rad")

        println("Diameter of the $name = ${diameter()}")
        println("Area of the $name = ${area()}")
        println("Perimeter of the $name = ${peri()}")
    }

    fun diameter() = 2*rad
     override fun area() = rad*rad*impNum.PI
    override fun peri() = 2*rad*impNum.PI
}